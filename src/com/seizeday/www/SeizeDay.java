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
			String month = "MONTH";
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
			String deadLine = "마감시한";
			Paint paintMonths = new Paint();
			Paint paintDayLine = new Paint();
			Paint paintRectangle = new Paint();
			Paint paintDays = new Paint();
			Paint paintStringOfDeadLine = new Paint();
			
			paintMonth.setColor(Color.BLACK);
			paintMonth.setTextSize(20);
			paintMonth.setTypeface(Typeface.create(Typeface.SANS_SERIF, Typeface.BOLD));
			canvas.drawText(month, 10, 20, paintMonth);	
			paintMonthLine.setStrokeWidth(2);
			canvas.drawLine(10, 25, 460, 25, paintMonthLine);
			paintMonths.setTextSize(15);
			paintMonths.setTypeface(Typeface.create(Typeface.SANS_SERIF, Typeface.NORMAL));
			canvas.drawText(january, 20, 50, paintMonths);
			canvas.drawText(february, 100, 50, paintMonths);
			canvas.drawText(march, 180, 50, paintMonths);
			canvas.drawText(april, 260, 50, paintMonths);
			canvas.drawText(may, 340, 50, paintMonths);
			canvas.drawText(june, 420, 50, paintMonths);
			canvas.drawText(july, 20, 80, paintMonths);
			canvas.drawText(august, 100, 80, paintMonths);
			canvas.drawText(september, 180, 80, paintMonths);
			canvas.drawText(october, 260, 80, paintMonths);
			canvas.drawText(november, 340, 80, paintMonths);
			canvas.drawText(december, 420, 80, paintMonths);
			canvas.drawLine(10, 95, 460, 95, paintMonthLine);
			paintRectangle.setColor(Color.BLACK);
			paintRectangle.setStrokeWidth(2);
			paintRectangle.setStyle(Paint.Style.STROKE);
			canvas.drawRect(10, 120 , 30, 140, paintRectangle);
			paintDayLine.setStrokeWidth(1.5f);
			canvas.drawLine(40, 120, 380, 120, paintDayLine);
			canvas.drawLine(390, 120, 460, 120, paintDayLine);
			paintDays.setTextSize(10);
			paintDays.setTypeface(Typeface.create(Typeface.SANS_SERIF, Typeface.NORMAL));
			canvas.drawText(sunday, 50, 134, paintDays);
			canvas.drawText(monday, 100, 134, paintDays);
			canvas.drawText(tuesday, 150, 134, paintDays);
			canvas.drawText(wednesday, 200, 134, paintDays);
			canvas.drawText(thursday, 250, 134, paintDays);
			canvas.drawText(friday, 300, 134, paintDays);
			canvas.drawText(saturday, 350, 134, paintDays);
			paintStringOfDeadLine.setTextSize(10);
			paintStringOfDeadLine.setTypeface(Typeface.create(Typeface.SANS_SERIF, Typeface.BOLD));
			canvas.drawText(deadLine, 405, 134, paintStringOfDeadLine);
			canvas.drawLine(40, 140, 380, 140, paintDayLine);
			canvas.drawLine(390, 140, 460, 140, paintDayLine);
		}
	}
}
