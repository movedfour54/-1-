// Exercise 08: Ticket Machine


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class calcuator_app extends Application {
	
   

    double a,b,c;//変数
    String op;
    String result;
    TextField tf = new TextField(); 
    Button zero=new Button("0");//各ボタンの作成
    Button one=new Button("1");
    Button two=new Button("2");
    Button three=new Button("3");
    Button four=new Button("4");
    Button five=new Button("5");
    Button six=new Button("6");
    Button seven=new Button("7");
    Button eight=new Button("8");
    Button nine=new Button("9");
    Button del=new Button("⌫");
    Button div=new Button("/");
    Button mul=new Button("*");
    Button sub=new Button("-");
    Button add=new Button("+");
    Button dot=new Button(".");
    Button inv=new Button("±");
    Button eq=new Button("=");
    Button per=new Button("%");
    Button clear=new Button("c");
    VBox vb;

    @Override
    public void start(Stage primaryStage) {
    	
    	tf.setEditable(false);
        tf.setFont(new Font(18));
        tf.setPrefColumnCount(6);
        tf.setAlignment(Pos.BASELINE_RIGHT);

       EnterNumber();
        
        

        // 各計算
        clear.setOnAction(e -> clear());
        eq.setOnAction(e->result());
        add.setOnAction(e->add());
        sub.setOnAction(e->subtract());
        per.setOnAction(e->percentage());
        inv.setOnAction(e->inverse());
        mul.setOnAction(e->multiplication());
        div.setOnAction(e->division()); 
        del.setOnAction(e->delete());
        

        // 画面の作成
        makeLayout();

        // 画面の宣言
        Scene scene = new Scene(vb);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculator");
        primaryStage.show();
    }

    public void makeLayout() {
        // 画面のデザイン
    	zero.setMinSize(100, 50);
    	zero.setFont(new Font(20));
    	one.setMinSize(100, 50);
    	one.setFont(new Font(20));
    	two.setMinSize(100, 50);
    	two.setFont(new Font(20));
    	three.setMinSize(100, 50);
    	three.setFont(new Font(20));
    	four.setMinSize(100, 50);
    	four.setFont(new Font(20));
    	five.setMinSize(100, 50);
    	five.setFont(new Font(20));
    	six.setMinSize(100, 50);
    	six.setFont(new Font(20));
    	seven.setMinSize(100, 50);
    	seven.setFont(new Font(20));
    	eight.setFont(new Font(20));
    	eight.setMinSize(100, 50);
    	nine.setFont(new Font(20));
    	nine.setMinSize(100, 50);
    	div.setMinSize(100, 50);
    	div.setFont(new Font(20));
    	mul.setMinSize(100, 50);
    	mul.setFont(new Font(20));
    	clear.setMinSize(100, 50);
    	clear.setFont(new Font(20));
    	del.setMinSize(100, 50);
    	del.setFont(new Font(20));
    	per.setMinSize(100, 50);
    	per.setFont(new Font(20));
    	sub.setMinSize(100, 50);
    	sub.setFont(new Font(20));
    	add.setMinSize(100, 50);
    	add.setFont(new Font(20));
    	inv.setMinSize(100, 50);
    	inv.setFont(new Font(20));
    	dot.setMinSize(100, 50);
    	dot.setFont(new Font(20));
    	eq.setMinSize(100, 50);
    	eq.setFont(new Font(20));
    	
    	HBox hbox1=new HBox(5,clear,del,per,div);
    	HBox hbox2=new HBox(5,seven,eight,nine,mul);
    	HBox hbox3=new HBox(5,four,five,six,sub);
    	HBox hbox4=new HBox(5,three,two,one,add);
    	HBox hbox5=new HBox(5,inv,zero,dot,eq);
    	vb=new VBox(5,tf,hbox1,hbox2,hbox3,hbox4,hbox5);
    	}

    public void EnterNumber() //数を入力してもらうメソッド
    {
    	zero.setOnAction(e->{
    		String Enter=tf.getText()+zero.getText();
    		tf.setText(Enter);
    	});
    	one.setOnAction(e->{
    		String Enter=tf.getText()+one.getText();
    		tf.setText(Enter);
    	});
    	two.setOnAction(e->{
    		String Enter=tf.getText()+two.getText();
    		tf.setText(Enter);
    	});
    	three.setOnAction(e->{
    		String Enter=tf.getText()+three.getText();
    		tf.setText(Enter);
    	});
    	four.setOnAction(e->{
    		String Enter=tf.getText()+four.getText();
    		tf.setText(Enter);
    	});
    	five.setOnAction(e->{
    		String Enter=tf.getText()+five.getText();
    		tf.setText(Enter);
    	});
    	six.setOnAction(e->{
    		String Enter=tf.getText()+six.getText();
    		tf.setText(Enter);
    	});
    	seven.setOnAction(e->{
    		String Enter=tf.getText()+seven.getText();
    		tf.setText(Enter);
    	});
    	eight.setOnAction(e->{
    		String Enter=tf.getText()+eight.getText();
    		tf.setText(Enter);
    	});
    	nine.setOnAction(e->{
    		String Enter=tf.getText()+nine.getText();
    		tf.setText(Enter);
    	});
    	dot.setOnAction(e->{
    		String Enter=tf.getText()+dot.getText();
    		tf.setText(Enter);
    	});
    }

    public void add() {//足し算
    	a=Double.parseDouble(tf.getText());
    	tf.clear();
    	op="+";
   }
    public void subtract() {//引き算
    	a=Double.parseDouble(tf.getText());
    	tf.clear();
    	op="-";
    }
    public void division() {//割り算
    	a=Double.parseDouble(tf.getText());
    	tf.clear();
    	op="/";
    }
    public void multiplication() {//かけ算
    	a=Double.parseDouble(tf.getText());
    	tf.clear();
    	op="*";
    }
    public void percentage() {//パーセントの計算
    	a=Double.parseDouble(tf.getText());
    	tf.clear();
    	op="%";
    }
    public void inverse() {//不正数の宣言
    	a=Double.parseDouble(tf.getText())*-1;
    	tf.setText(String.valueOf(a));
    	op="+";
    }
    public void delete() {//数字の削除
    	String delete=null;
    	if(tf.getText().length()>0) {
    		StringBuilder sb=new StringBuilder(tf.getText());
    		sb.deleteCharAt(tf.getText().length()-1);
    		delete=sb.toString();
    		tf.setText(delete);
    	}
    }

    public void clear() {//テキストフィールドの削除
    	tf.clear();
    }
    public void result() {//計算結果の出力
    	b=Double.parseDouble(tf.getText());
    	if(op=="+")
    	{
    		c=a+b;
    		result=String.format("%.2f", c);
    		tf.setText(result);
    	}
    	else if(op=="-")
    	{
    		c=a-b;
    		result=String.format("%.2f", c);
    		tf.setText(result);
    	}
    	else if(op=="*")
    	{
    		c=a*b;
    		result=String.format("%.2f", c);
    		tf.setText(result);
    	}
    	else if(op=="/")
    	{
    		c=a/b;
    		result=String.format("%.2f", c);
    		tf.setText(result);
    	}
    	else if(op=="%")
    	{
    		c=a/b*100;
    		result=String.format("%.2f", c);
    		tf.setText(result+"%");
    	}
    }

    public static void main(String[] args) {
        Application.launch(args);
        System.out.println("完了--Calculator");
    }

}
