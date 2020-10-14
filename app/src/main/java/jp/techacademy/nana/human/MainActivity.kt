package jp.techacademy.nana.human

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //インスタンス作成
        val human= Human("ポチ", 3)
        val hobby= Human("CLANNAD", 3)

        //呼び出し
        human.say()
        hobby.think()

    }
}
//課題：抽象クラス
open class Human: Animal,Thinkable {
    // 引数付きコンストラクタ
    constructor(name: String, age: Int): super(name, age) {
    }

    // インスタンスのsayメソッドで出力
    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name +"です。年は" + this.age +  "歳です。")
    }

    override fun think() {
        Log.d("kotlintest", "私は" + this.name +"について考える。")
    }

}
