package com.seizeday.www;

import android.app.*;
import android.content.*;
import android.graphics.*;
import android.os.*;
import android.view.*;

public class SeizeDay extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		CalendarView calendarView = new CalendarView(this);
		setContentView(calendarView);
	}
	
	public class CalendarView extends View {
		public CalendarView (Context context) {
			super(context);
		}
		
		public void onDraw(Canvas canvas) {
			Paint paintMonth = new Paint();
			String month = "Month";
			Paint paintMonthLine = new Paint();
			String january = "JUN";
			String february = "FAB";
			String march = "MAR";
			String april = "APR";
			String may = "MAY";
			String june = "JUN";
			String july = "JUL";
			String august = "AUG";
			String september = "SEP";
			String october = "OCT";
			String november = "NOV";
			String december = "DEC";
			String monday = "MON";
			String tuesday = "TUE";
			String wednesday = "WED";
			String thursday = "THU";
			String friday = "FRI";
			String saturday = "SAT";
			String sunday = "SUN";
			Paint paintDayLine = new Paint();
			
			paintMonth.setColor(Color.BLACK);
			paintMonth.setTextSize(20);
			paintMonth.setTypeface(Typeface.create((String)null, Typeface.BOLD));
			canvas.drawText(month, 10, 20, paintMonth);	
			paintMonthLine.setStrokeWidth(2);
			canvas.drawLine(10, 25, 470, 25, paintMonthLine);
			
			
		}
	}
}
