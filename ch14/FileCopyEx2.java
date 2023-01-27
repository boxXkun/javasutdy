package ch14;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopyEx2 extends MFrame implements ActionListener {

	Button open, save;
	TextArea ta;
	FileDialog openDialog, saveDialog;
	String sourceDir;
	String sourceFile;

	public FileCopyEx2() {
		super(400, 500);
		setTitle("FileCopyEx2");
		add(ta = new TextArea());
		Panel p = new Panel();
		p.add(open = new Button("OPEN"));
		p.add(save = new Button("SAVE"));
		ta.setEditable(false);
		open.addActionListener(this);
		save.addActionListener(this);
		add(p, BorderLayout.SOUTH);
		validate();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == open) {
			openDialog = new FileDialog(this, "���Ͽ���", FileDialog.LOAD);
			openDialog.setVisible(true);
			String dir, file;
			dir = openDialog.getDirectory();
			file = openDialog.getFile();
			// System.out.println(dir + " : " + file);
			fileReader(dir + file);
		} else if (obj == save) {
			saveDialog = new FileDialog(this, "��������", FileDialog.SAVE);
			saveDialog.setVisible(true);
			String dir, file;
			dir = saveDialog.getDirectory();
			file = saveDialog.getFile();

			
		}
	}

	// ���õ� ������ ������ ta�� append �ؾ���
	public void fileReader(String file) {
		try {
			FileReader fr = new FileReader(file);
			int a;
			String s = "";

			while ((a = fr.read()) != -1) {
				s += (char) a;
			}
			ta.setText(s);
			fr.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ta�� ���µ� �ؽ�Ʈ�� ������ ���Ϸ� ���� �ؾ���
	public void fileWriter(String file) {
		try {
			FileWriter fw = new FileWriter(file);
			fw.write(ta.getText());
			ta.setText("");
			for (int i = 5; i > 0; i--) {
				ta.setText("���� �Ͽ����ϴ�. - " + i + "���Ŀ� ������ϴ�.");
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		ta.setText("");
	}

	public static void main(String[] args) {
		new FileCopyEx2();
	}
}