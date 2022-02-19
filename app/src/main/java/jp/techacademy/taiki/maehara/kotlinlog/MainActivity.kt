package jp.techacademy.taiki.maehara.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Log.d("kotlintest", "ログへの出力テスト")
//
//        // 整数型の変数をnumという名前で作成して、10を代入する
//        var num = 10
//        Log.d("kotlintest", Integer.toString(num))
//
//        // numに50を代入する
//        // 変数や定数に .toString() と記述する方法もある
//        num = 50
//        Log.d("kotlintest", num.toString())
//
//        val num1 = 10 + 5 - 2 * 4 / 2
//        Log.d("kotlintest", "10 + 5 - 2 * 4 / 3 = " + num1)
//
//        val flag1 = true
//        val flag2 = false
//        Log.d("kotlintest", "flag1 && flag2 = " + (flag1 && flag2))
//        Log.d("kotlintest", "flag1 || flag2 = " + (flag1 || flag2))
//
//        val num2 = 10
//        val num3 = 20
//        Log.d("kotlintest", "num2 < num3 = " + (num2 < num3))
//
//        num = 60
//
//        if (num >= 90) {
//            Log.d("kotlintest", "優")
//        } else if (num >= 75) {
//            Log.d("kotlintest", "良")
//        } else if (num >= 60) {
//            Log.d("kotlintest", "可")
//        } else {
//            Log.d("kotlintest", "不可")
//        }
//
//        val drink = 1
//
//        when(drink){
//            0 -> {
//                Log.d("kotlintest", "コーヒーを注文しました")
//            }
//            1 -> Log.d("kotlintest", "紅茶を注文しました")
//            2 -> Log.d("kotlintest", "ミルクを注文しました")
//            else -> Log.d("kotlintest", "オーダーミスです")
//        }
//
//        for (i in 1 until 6) {
//            Log.d("kotlintest", "for文の " + i + "回目")
//        }
//
//        num = 1
//
//        while(num < 6) {
//            Log.d("kotlintest", "while文の " + num + "回目")
//            num++
//        }
//
//        //1から3まで(3含む)
//        for (i in 1..3) {
//            Log.d("kotlintest", "..演算子の" + i + "の回")
//        }
//
//        //6から2飛ばしずつ0まで
//        for (i in 6 downTo 0 step 2) {
//            Log.d("kotlintest", "downTo関数の" + i + "の回")
//        }
//
//        // Array<Int>型の配列が作成される
//        val points = arrayOf(10, 6, 15, 23, 17)
//
//        for (i in points) {
//            Log.d("kotlintest", i.toString())
//        }
//
//        val numA = 100
//        val numB = 0
//        var ans = 0
//
//        try {
//            ans = numA / numB
//        } catch (e : Exception) {
//            Log.d("kotlintest", "0で割ろうとしました")
//            // 例外情報から、メッセージを表示
//            Log.d("kotlintest", e.message.toString())
//        }finally {
//            Log.d("kotlintest", "ans = " + ans.toString() )
//        }
//
//        // 引数に50と1000を指定してtotal関数を呼び出す
////        total(50, 1000)
//
//        // 引数の値を変えることで処理内容を簡単に変更できる
////        total(1, 1111)
//
////        total(1,1000)
//
////        total(last = 1000, first = 1)
//
//        val t = total(50, 1000) //ここでtotalからsumを返してもらう
//        Log.d("kotlintest", t.toString())
//
//        //ラムダ式( ->(アロー)の左側に引数、右側に関数本体を記述)
//        val lmb = {x: Int, y: Int -> x + y}
//        val z1 = lmb(100,200)
//        Log.d("kotlintest", z1.toString())
//
//        //ラムダ式(記述と呼び出しをまとめたバージョン)
//        val z4 = {x: Int, y: Int -> x + y}(100,200)
//        Log.d("kotlintest", z4.toString())
//
//        //無名関数
//        val anf = fun(x: Int, y: Int): Int { return x + y}
//        val z2 = anf(100, 200)
//        Log.d("kotlintest", z2.toString())
//
//        //無名関数(記述と呼び出しをまとめたバージョン)
//        val z3 = fun(x: Int, y: Int): Int { return x + y}(100, 200)
//        Log.d("kotlintest", z3.toString())
//
//
//        val dog = Dog("ポチ", 3)  //名前をポチ、年齢3歳でDogのインスタンスを作る
//
//        dog.say() //ポチが吠える(ログ出力)
//        Log.d("kotlintest", "犬の名前は" + dog.name + "です。")
//        Log.d("kotlintest", "犬の年齢は" + dog.age + "歳です。")
//        dog.move()
//
//        val dog2 = Dog("ハチ", 10)
//
//        dog2.say()
//        Log.d("kotlintest", "犬の名前は" + dog2.name + "です。")
//        Log.d("kotlintest", "犬の年齢は" + dog2.age + "歳です。")
//
//        val bigdog = BigDog("ヨーゼフ", 15) //名前をヨーゼフ、年齢15歳でBigDogのインスタンスを作る
//
//        bigdog.say()
//        Log.d("kotlintest", "犬の名前は" + bigdog.name + "です。")
//        Log.d("kotlintest", "犬の名前は" + bigdog.age + "歳です。")

        val human1 = Human("山田", 15, "読書")
        human1.say()
        human1.think()

        val human2 = Human("田中", 30, "スポーツ")
        human2.say()
        human2.think()

    }


    // firstとlast,2つの引数と戻り値の型(int)を指定
    private fun total(first: Int, last: Int = 1000): Int {
        var sum = 0
        for (i in first..last) {
            sum += i
        }
//        Log.d("kotlintest", sum.toString())
        return sum
    }

}