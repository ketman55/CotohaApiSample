package com.lab.app.ketman.data;

import java.util.HashMap;

public class InstructionsMaster {
	private HashMap<String, String> instructionsMaster  = new HashMap<String, String>();

	public InstructionsMaster(){
		// 加速する
		instructionsMaster.put("加速しろ", "加速する");
		instructionsMaster.put("行け", "加速する");
		instructionsMaster.put("負けるな", "加速する");
		instructionsMaster.put("かっとべ", "加速する");
		instructionsMaster.put("頑張れ", "加速する");
		instructionsMaster.put("抜け", "加速する");
		instructionsMaster.put("追いつけ", "加速する");

		// 減速する
		instructionsMaster.put("減速しろ", "減速する");
		instructionsMaster.put("前を譲れ", "減速する");
		instructionsMaster.put("スピードを落とせ", "減速する");
		instructionsMaster.put("待て", "減速する");

		// 前進する
		instructionsMaster.put("走れ", "前進する");
		instructionsMaster.put("動け", "前進する");

		// 右に寄る
		instructionsMaster.put("右だ", "右に寄る");
		instructionsMaster.put("右に寄れ", "右に寄る");

		// 右に曲がる
		instructionsMaster.put("右に曲がれ", "右に曲がる");

		// 左に寄る
		instructionsMaster.put("左だ", "左に寄る");
		instructionsMaster.put("左に寄れ", "左に寄る");

		// 左に曲がる
		instructionsMaster.put("左に曲がれ", "左に曲がる");

		// 後進する
		instructionsMaster.put("後ろへ下がれ", "後進する");
		instructionsMaster.put("バックしろ", "後進する");

		// 止まる
		instructionsMaster.put("止まれ", "止まる");
		instructionsMaster.put("ストップだ", "止まる");

		// 前の機体の後ろにつく
		instructionsMaster.put("引っ張ってもらえ", "前の機体の後ろにつく");
		instructionsMaster.put("ついていけ", "前の機体の後ろにつく");

		// 後ろの機体の前に移動する
		instructionsMaster.put("引っ張れ", "前の機体の前に移動する");
		instructionsMaster.put("つれて行け", "前の機体の前に移動する");
		instructionsMaster.put("抜かせるな", "前の機体の前に移動する");

		// 必殺技
		instructionsMaster.put("バスターターンだ", "バスターターンをする");

		// 課題
		// 否定形がある「飛ぶなトライダガー」
		// 「どの」を判断した方が良い時がある「ソニックに続け！」
		//
	}

	public HashMap<String, String> getInstructionsMap(){
		return instructionsMaster;
	}
}
