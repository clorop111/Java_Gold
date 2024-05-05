package ex13;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Sample2 {
	public static void main(String[] args) throws Exception{
		System.out.print(">");
		//Scannerクラスのインスタンスを作成し、キーボードから入力された文字列や数値を受け取って、処理する
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		//dirディレクトリ配下のファイル(コンソールで指定)のパスを取得
		Path p = Paths.get("dir", name);

		//もし指定したファイルが存在しなければ、新しくファイルを作成
		if(Files.exists(p) == false) {
			Files.createFile(p);
		}
		//最終更新日をコンソールに出力
		System.out.println(Files.getLastModifiedTime(p));
		//ファイルのアクセス権を調べるためのメソッド
		System.out.println(Files.getPosixFilePermissions(p));
	}
}