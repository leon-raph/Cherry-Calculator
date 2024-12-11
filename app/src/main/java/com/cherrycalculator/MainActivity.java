package com.cherrycalculator;

import android.animation.*;
import android.animation.ObjectAnimator;
import android.app.*;
import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.*;
import android.content.Context;
import android.content.res.*;
import android.graphics.*;
import android.graphics.Typeface;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.os.Vibrator;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.webkit.*;
import android.widget.*;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.*;
import java.text.*;
import java.text.DecimalFormat;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class MainActivity extends Activity {
	
	private String currentequation_number = "";
	private boolean before = false;
	private double a = 0;
	private double b = 0;
	private String symbol = "";
	private boolean point = false;
	private String num = "";
	private String num1 = "";
	
	private LinearLayout linear1;
	private TextView output;
	private LinearLayout linear11;
	private LinearLayout linear10;
	private LinearLayout linear9;
	private LinearLayout linear8;
	private LinearLayout linear7;
	private LinearLayout linear37;
	private TextView credit;
	private TextView currentequation;
	private LinearLayout a7;
	private LinearLayout a8;
	private LinearLayout a9;
	private TextView textview14;
	private TextView textview15;
	private TextView textview16;
	private LinearLayout a4;
	private LinearLayout a5;
	private LinearLayout a6;
	private TextView textview10;
	private TextView textview11;
	private TextView textview12;
	private LinearLayout a1;
	private LinearLayout a2;
	private LinearLayout a3;
	private TextView textview6;
	private TextView textview7;
	private TextView textview8;
	private LinearLayout a0;
	private LinearLayout dot;
	private LinearLayout equals;
	private TextView textview4;
	private TextView textview19;
	private TextView textview1;
	private LinearLayout clearall;
	private LinearLayout set;
	private LinearLayout divide;
	private LinearLayout multiply;
	private LinearLayout minus;
	private LinearLayout plus;
	private TextView textview2;
	private TextView textview21;
	private TextView textview18;
	private TextView textview17;
	private TextView textview13;
	private TextView textview9;
	
	private Vibrator v;
	private ObjectAnimator anim = new ObjectAnimator();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		output = findViewById(R.id.output);
		linear11 = findViewById(R.id.linear11);
		linear10 = findViewById(R.id.linear10);
		linear9 = findViewById(R.id.linear9);
		linear8 = findViewById(R.id.linear8);
		linear7 = findViewById(R.id.linear7);
		linear37 = findViewById(R.id.linear37);
		credit = findViewById(R.id.credit);
		currentequation = findViewById(R.id.currentequation);
		a7 = findViewById(R.id.a7);
		a8 = findViewById(R.id.a8);
		a9 = findViewById(R.id.a9);
		textview14 = findViewById(R.id.textview14);
		textview15 = findViewById(R.id.textview15);
		textview16 = findViewById(R.id.textview16);
		a4 = findViewById(R.id.a4);
		a5 = findViewById(R.id.a5);
		a6 = findViewById(R.id.a6);
		textview10 = findViewById(R.id.textview10);
		textview11 = findViewById(R.id.textview11);
		textview12 = findViewById(R.id.textview12);
		a1 = findViewById(R.id.a1);
		a2 = findViewById(R.id.a2);
		a3 = findViewById(R.id.a3);
		textview6 = findViewById(R.id.textview6);
		textview7 = findViewById(R.id.textview7);
		textview8 = findViewById(R.id.textview8);
		a0 = findViewById(R.id.a0);
		dot = findViewById(R.id.dot);
		equals = findViewById(R.id.equals);
		textview4 = findViewById(R.id.textview4);
		textview19 = findViewById(R.id.textview19);
		textview1 = findViewById(R.id.textview1);
		clearall = findViewById(R.id.clearall);
		set = findViewById(R.id.set);
		divide = findViewById(R.id.divide);
		multiply = findViewById(R.id.multiply);
		minus = findViewById(R.id.minus);
		plus = findViewById(R.id.plus);
		textview2 = findViewById(R.id.textview2);
		textview21 = findViewById(R.id.textview21);
		textview18 = findViewById(R.id.textview18);
		textview17 = findViewById(R.id.textview17);
		textview13 = findViewById(R.id.textview13);
		textview9 = findViewById(R.id.textview9);
		v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		
		output.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				output.setText(new DecimalFormat("").format(Math.round(Double.parseDouble(output.getText().toString()))));
			}
		});
		
		credit.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Cherry Calculator made by Rapha Chege");
			}
		});
		
		a7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (point) {
					num1 = num1.concat("7");
				}
				else {
					currentequation_number = currentequation_number.concat("7");
				}
				_clicked();
				ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat(a7, "scaleX", 1f, 0.8f);
				    scaleXAnimator.setDuration(100);
				    scaleXAnimator.setRepeatCount(1);
				    scaleXAnimator.setRepeatMode(ObjectAnimator.REVERSE);
				    scaleXAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
				
				    ObjectAnimator scaleYAnimator = ObjectAnimator.ofFloat(a7, "scaleY", 1f, 0.8f);
				    scaleYAnimator.setDuration(100);
				    scaleYAnimator.setRepeatCount(1);
				    scaleYAnimator.setRepeatMode(ObjectAnimator.REVERSE);
				    scaleYAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
				
				    AnimatorSet animatorSet = new AnimatorSet();
				    animatorSet.playTogether(scaleXAnimator, scaleYAnimator);
				    animatorSet.start();
			}
		});
		
		a8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (point) {
					num1 = num1.concat("8");
				}
				else {
					currentequation_number = currentequation_number.concat("8");
				}
				_clicked();
				ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat(a8, "scaleX", 1f, 0.8f);
				    scaleXAnimator.setDuration(100);
				    scaleXAnimator.setRepeatCount(1);
				    scaleXAnimator.setRepeatMode(ObjectAnimator.REVERSE);
				    scaleXAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
				
				    ObjectAnimator scaleYAnimator = ObjectAnimator.ofFloat(a8, "scaleY", 1f, 0.8f);
				    scaleYAnimator.setDuration(100);
				    scaleYAnimator.setRepeatCount(1);
				    scaleYAnimator.setRepeatMode(ObjectAnimator.REVERSE);
				    scaleYAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
				
				    AnimatorSet animatorSet = new AnimatorSet();
				    animatorSet.playTogether(scaleXAnimator, scaleYAnimator);
				    animatorSet.start();
			}
		});
		
		a9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (point) {
					num1 = num1.concat("9");
				}
				else {
					currentequation_number = currentequation_number.concat("9");
				}
				_clicked();
				ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat(a9, "scaleX", 1f, 0.8f);
				    scaleXAnimator.setDuration(100);
				    scaleXAnimator.setRepeatCount(1);
				    scaleXAnimator.setRepeatMode(ObjectAnimator.REVERSE);
				    scaleXAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
				
				    ObjectAnimator scaleYAnimator = ObjectAnimator.ofFloat(a9, "scaleY", 1f, 0.8f);
				    scaleYAnimator.setDuration(100);
				    scaleYAnimator.setRepeatCount(1);
				    scaleYAnimator.setRepeatMode(ObjectAnimator.REVERSE);
				    scaleYAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
				
				    AnimatorSet animatorSet = new AnimatorSet();
				    animatorSet.playTogether(scaleXAnimator, scaleYAnimator);
				    animatorSet.start();
			}
		});
		
		a4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (point) {
					num1 = num1.concat("4");
				}
				else {
					currentequation_number = currentequation_number.concat("4");
				}
				_clicked();
				ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat(a4, "scaleX", 1f, 0.8f);
				    scaleXAnimator.setDuration(100);
				    scaleXAnimator.setRepeatCount(1);
				    scaleXAnimator.setRepeatMode(ObjectAnimator.REVERSE);
				    scaleXAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
				
				    ObjectAnimator scaleYAnimator = ObjectAnimator.ofFloat(a4, "scaleY", 1f, 0.8f);
				    scaleYAnimator.setDuration(100);
				    scaleYAnimator.setRepeatCount(1);
				    scaleYAnimator.setRepeatMode(ObjectAnimator.REVERSE);
				    scaleYAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
				
				    AnimatorSet animatorSet = new AnimatorSet();
				    animatorSet.playTogether(scaleXAnimator, scaleYAnimator);
				    animatorSet.start();
			}
		});
		
		a5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (point) {
					num1 = num1.concat("5");
				}
				else {
					currentequation_number = currentequation_number.concat("5");
				}
				_clicked();
				ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat(a5, "scaleX", 1f, 0.8f);
				    scaleXAnimator.setDuration(100);
				    scaleXAnimator.setRepeatCount(1);
				    scaleXAnimator.setRepeatMode(ObjectAnimator.REVERSE);
				    scaleXAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
				
				    ObjectAnimator scaleYAnimator = ObjectAnimator.ofFloat(a5, "scaleY", 1f, 0.8f);
				    scaleYAnimator.setDuration(100);
				    scaleYAnimator.setRepeatCount(1);
				    scaleYAnimator.setRepeatMode(ObjectAnimator.REVERSE);
				    scaleYAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
				
				    AnimatorSet animatorSet = new AnimatorSet();
				    animatorSet.playTogether(scaleXAnimator, scaleYAnimator);
				    animatorSet.start();
			}
		});
		
		a6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (point) {
					num1 = num1.concat("6");
				}
				else {
					currentequation_number = currentequation_number.concat("6");
				}
				_clicked();
				ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat(a6, "scaleX", 1f, 0.8f);
				    scaleXAnimator.setDuration(100);
				    scaleXAnimator.setRepeatCount(1);
				    scaleXAnimator.setRepeatMode(ObjectAnimator.REVERSE);
				    scaleXAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
				
				    ObjectAnimator scaleYAnimator = ObjectAnimator.ofFloat(a6, "scaleY", 1f, 0.8f);
				    scaleYAnimator.setDuration(100);
				    scaleYAnimator.setRepeatCount(1);
				    scaleYAnimator.setRepeatMode(ObjectAnimator.REVERSE);
				    scaleYAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
				
				    AnimatorSet animatorSet = new AnimatorSet();
				    animatorSet.playTogether(scaleXAnimator, scaleYAnimator);
				    animatorSet.start();
			}
		});
		
		a1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (point) {
					num1 = num1.concat("1");
				}
				else {
					currentequation_number = currentequation_number.concat("1");
				}
				_clicked();
				ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat(a1, "scaleX", 1f, 0.8f);
				    scaleXAnimator.setDuration(100);
				    scaleXAnimator.setRepeatCount(1);
				    scaleXAnimator.setRepeatMode(ObjectAnimator.REVERSE);
				    scaleXAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
				
				    ObjectAnimator scaleYAnimator = ObjectAnimator.ofFloat(a1, "scaleY", 1f, 0.8f);
				    scaleYAnimator.setDuration(100);
				    scaleYAnimator.setRepeatCount(1);
				    scaleYAnimator.setRepeatMode(ObjectAnimator.REVERSE);
				    scaleYAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
				
				    AnimatorSet animatorSet = new AnimatorSet();
				    animatorSet.playTogether(scaleXAnimator, scaleYAnimator);
				    animatorSet.start();
			}
		});
		
		a2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (point) {
					num1 = num1.concat("2");
				}
				else {
					currentequation_number = currentequation_number.concat("2");
				}
				_clicked();
				ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat(a2, "scaleX", 1f, 0.8f);
				    scaleXAnimator.setDuration(100);
				    scaleXAnimator.setRepeatCount(1);
				    scaleXAnimator.setRepeatMode(ObjectAnimator.REVERSE);
				    scaleXAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
				
				    ObjectAnimator scaleYAnimator = ObjectAnimator.ofFloat(a2, "scaleY", 1f, 0.8f);
				    scaleYAnimator.setDuration(100);
				    scaleYAnimator.setRepeatCount(1);
				    scaleYAnimator.setRepeatMode(ObjectAnimator.REVERSE);
				    scaleYAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
				
				    AnimatorSet animatorSet = new AnimatorSet();
				    animatorSet.playTogether(scaleXAnimator, scaleYAnimator);
				    animatorSet.start();
			}
		});
		
		a3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (point) {
					num1 = num1.concat("3");
				}
				else {
					currentequation_number = currentequation_number.concat("3");
				}
				_clicked();
				ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat(a3, "scaleX", 1f, 0.8f);
				    scaleXAnimator.setDuration(100);
				    scaleXAnimator.setRepeatCount(1);
				    scaleXAnimator.setRepeatMode(ObjectAnimator.REVERSE);
				    scaleXAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
				
				    ObjectAnimator scaleYAnimator = ObjectAnimator.ofFloat(a3, "scaleY", 1f, 0.8f);
				    scaleYAnimator.setDuration(100);
				    scaleYAnimator.setRepeatCount(1);
				    scaleYAnimator.setRepeatMode(ObjectAnimator.REVERSE);
				    scaleYAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
				
				    AnimatorSet animatorSet = new AnimatorSet();
				    animatorSet.playTogether(scaleXAnimator, scaleYAnimator);
				    animatorSet.start();
			}
		});
		
		a0.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (point) {
					num1 = num1.concat("0");
				}
				else {
					currentequation_number = currentequation_number.concat("0");
				}
				_clicked();
				ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat(a0, "scaleX", 1f, 0.8f);
				    scaleXAnimator.setDuration(100);
				    scaleXAnimator.setRepeatCount(1);
				    scaleXAnimator.setRepeatMode(ObjectAnimator.REVERSE);
				    scaleXAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
				
				    ObjectAnimator scaleYAnimator = ObjectAnimator.ofFloat(a0, "scaleY", 1f, 0.8f);
				    scaleYAnimator.setDuration(100);
				    scaleYAnimator.setRepeatCount(1);
				    scaleYAnimator.setRepeatMode(ObjectAnimator.REVERSE);
				    scaleYAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
				
				    AnimatorSet animatorSet = new AnimatorSet();
				    animatorSet.playTogether(scaleXAnimator, scaleYAnimator);
				    animatorSet.start();
			}
		});
		
		dot.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!currentequation_number.contains(".")) {
					point = true;
					num = currentequation_number;
					currentequation_number = "";
					if (num.isEmpty()) {
						num = "0";
					}
				}
				ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat(dot, "scaleX", 1f, 0.8f);
				    scaleXAnimator.setDuration(100);
				    scaleXAnimator.setRepeatCount(1);
				    scaleXAnimator.setRepeatMode(ObjectAnimator.REVERSE);
				    scaleXAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
				
				    ObjectAnimator scaleYAnimator = ObjectAnimator.ofFloat(dot, "scaleY", 1f, 0.8f);
				    scaleYAnimator.setDuration(100);
				    scaleYAnimator.setRepeatCount(1);
				    scaleYAnimator.setRepeatMode(ObjectAnimator.REVERSE);
				    scaleYAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
				
				    AnimatorSet animatorSet = new AnimatorSet();
				    animatorSet.playTogether(scaleXAnimator, scaleYAnimator);
				    animatorSet.start();
				v.vibrate((long)(5));
			}
		});
		
		equals.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				before = true;
				point = false;
				if (symbol.equals("/")) {
					output.setText(new DecimalFormat("").format(a / b));
				}
				if (symbol.equals("x")) {
					output.setText(new DecimalFormat("").format(a * b));
				}
				if (symbol.equals("-")) {
					output.setText(new DecimalFormat("").format(a - b));
				}
				if (symbol.equals("+")) {
					output.setText(new DecimalFormat("").format(a + b));
				}
				ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat(equals, "scaleX", 1f, 0.8f);
				    scaleXAnimator.setDuration(100);
				    scaleXAnimator.setRepeatCount(1);
				    scaleXAnimator.setRepeatMode(ObjectAnimator.REVERSE);
				    scaleXAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
				
				    ObjectAnimator scaleYAnimator = ObjectAnimator.ofFloat(equals, "scaleY", 1f, 0.8f);
				    scaleYAnimator.setDuration(100);
				    scaleYAnimator.setRepeatCount(1);
				    scaleYAnimator.setRepeatMode(ObjectAnimator.REVERSE);
				    scaleYAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
				
				    AnimatorSet animatorSet = new AnimatorSet();
				    animatorSet.playTogether(scaleXAnimator, scaleYAnimator);
				    animatorSet.start();
				v.vibrate((long)(5));
			}
		});
		
		clearall.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				currentequation_number = "";
				symbol = "";
				num = "";
				num1 = "";
				before = true;
				point = false;
				output.setText("0");
				currentequation.setText("0");
				ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat(clearall, "scaleX", 1f, 0.8f);
				    scaleXAnimator.setDuration(100);
				    scaleXAnimator.setRepeatCount(1);
				    scaleXAnimator.setRepeatMode(ObjectAnimator.REVERSE);
				    scaleXAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
				
				    ObjectAnimator scaleYAnimator = ObjectAnimator.ofFloat(clearall, "scaleY", 1f, 0.8f);
				    scaleYAnimator.setDuration(100);
				    scaleYAnimator.setRepeatCount(1);
				    scaleYAnimator.setRepeatMode(ObjectAnimator.REVERSE);
				    scaleYAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
				
				    AnimatorSet animatorSet = new AnimatorSet();
				    animatorSet.playTogether(scaleXAnimator, scaleYAnimator);
				    animatorSet.start();
				v.vibrate((long)(5));
			}
		});
		
		set.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				point = false;
				ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat(set, "scaleX", 1f, 0.8f);
				    scaleXAnimator.setDuration(100);
				    scaleXAnimator.setRepeatCount(1);
				    scaleXAnimator.setRepeatMode(ObjectAnimator.REVERSE);
				    scaleXAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
				
				    ObjectAnimator scaleYAnimator = ObjectAnimator.ofFloat(set, "scaleY", 1f, 0.8f);
				    scaleYAnimator.setDuration(100);
				    scaleYAnimator.setRepeatCount(1);
				    scaleYAnimator.setRepeatMode(ObjectAnimator.REVERSE);
				    scaleYAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
				
				    AnimatorSet animatorSet = new AnimatorSet();
				    animatorSet.playTogether(scaleXAnimator, scaleYAnimator);
				    animatorSet.start();
				if (currentequation_number.isEmpty()) {
					currentequation_number = "0";
				}
				if (currentequation_number.contains("-")) {
					currentequation_number = currentequation_number.replace("-", "");
				}
				else {
					currentequation_number = "-".concat(currentequation_number);
				}
				_clicked();
			}
		});
		
		divide.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				symbol = "/";
				_symbolclicked();
				ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat(divide, "scaleX", 1f, 0.8f);
				    scaleXAnimator.setDuration(100);
				    scaleXAnimator.setRepeatCount(1);
				    scaleXAnimator.setRepeatMode(ObjectAnimator.REVERSE);
				    scaleXAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
				
				    ObjectAnimator scaleYAnimator = ObjectAnimator.ofFloat(divide, "scaleY", 1f, 0.8f);
				    scaleYAnimator.setDuration(100);
				    scaleYAnimator.setRepeatCount(1);
				    scaleYAnimator.setRepeatMode(ObjectAnimator.REVERSE);
				    scaleYAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
				
				    AnimatorSet animatorSet = new AnimatorSet();
				    animatorSet.playTogether(scaleXAnimator, scaleYAnimator);
				    animatorSet.start();
			}
		});
		
		multiply.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				symbol = "x";
				_symbolclicked();
				ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat(multiply, "scaleX", 1f, 0.8f);
				    scaleXAnimator.setDuration(100);
				    scaleXAnimator.setRepeatCount(1);
				    scaleXAnimator.setRepeatMode(ObjectAnimator.REVERSE);
				    scaleXAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
				
				    ObjectAnimator scaleYAnimator = ObjectAnimator.ofFloat(multiply, "scaleY", 1f, 0.8f);
				    scaleYAnimator.setDuration(100);
				    scaleYAnimator.setRepeatCount(1);
				    scaleYAnimator.setRepeatMode(ObjectAnimator.REVERSE);
				    scaleYAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
				
				    AnimatorSet animatorSet = new AnimatorSet();
				    animatorSet.playTogether(scaleXAnimator, scaleYAnimator);
				    animatorSet.start();
			}
		});
		
		minus.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				symbol = "-";
				_symbolclicked();
				ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat(minus, "scaleX", 1f, 0.8f);
				    scaleXAnimator.setDuration(100);
				    scaleXAnimator.setRepeatCount(1);
				    scaleXAnimator.setRepeatMode(ObjectAnimator.REVERSE);
				    scaleXAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
				
				    ObjectAnimator scaleYAnimator = ObjectAnimator.ofFloat(minus, "scaleY", 1f, 0.8f);
				    scaleYAnimator.setDuration(100);
				    scaleYAnimator.setRepeatCount(1);
				    scaleYAnimator.setRepeatMode(ObjectAnimator.REVERSE);
				    scaleYAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
				
				    AnimatorSet animatorSet = new AnimatorSet();
				    animatorSet.playTogether(scaleXAnimator, scaleYAnimator);
				    animatorSet.start();
			}
		});
		
		plus.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				symbol = "+";
				_symbolclicked();
				ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat(plus, "scaleX", 1f, 0.8f);
				    scaleXAnimator.setDuration(100);
				    scaleXAnimator.setRepeatCount(1);
				    scaleXAnimator.setRepeatMode(ObjectAnimator.REVERSE);
				    scaleXAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
				
				    ObjectAnimator scaleYAnimator = ObjectAnimator.ofFloat(plus, "scaleY", 1f, 0.8f);
				    scaleYAnimator.setDuration(100);
				    scaleYAnimator.setRepeatCount(1);
				    scaleYAnimator.setRepeatMode(ObjectAnimator.REVERSE);
				    scaleYAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
				
				    AnimatorSet animatorSet = new AnimatorSet();
				    animatorSet.playTogether(scaleXAnimator, scaleYAnimator);
				    animatorSet.start();
			}
		});
	}
	
	private void initializeLogic() {
		linear1.setBackgroundColor(0xFF000000);
		before = true;
		point = false;
		currentequation_number = "";
		output.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/arsegment7display.ttf"), 0);
	}
	
	public void _clicked() {
		// Check if it's not "0", "-0", "0.<number>", or "-0.<number>"
		if (!currentequation_number.equals("0") && !currentequation_number.equals("-0") 
		    && !currentequation_number.matches("^-?0\\.\\d+")) {
			    currentequation_number = currentequation_number.replaceFirst("^-?0", "");
		}
		
		if (point) {
			currentequation_number = num.concat(".".concat(num1));
		}
		if (before) {
			a = Double.parseDouble(currentequation_number);
			currentequation.setText(currentequation_number);
		}
		else {
			b = Double.parseDouble(currentequation_number);
			if (new DecimalFormat("").format(b).contains("-")) {
				currentequation.setText(new DecimalFormat("").format(a).concat(" ".concat(symbol.concat(" ")).concat("(".concat(new DecimalFormat("").format(b).concat(")")))));
			}
			else {
				currentequation.setText(new DecimalFormat("").format(a).concat(" ".concat(symbol.concat(" ")).concat(new DecimalFormat("").format(b))));
			}
		}
		output.setText(currentequation_number);
		v.vibrate((long)(5));
	}
	
	
	public void _symbolclicked() {
		before = false;
		point = false;
		currentequation_number = "";
		num1 = "";
		num = "";
		v.vibrate((long)(5));
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}