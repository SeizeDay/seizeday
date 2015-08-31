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
			Paint paintWriteLine = new Paint();
			Paint paintRectangleOfDeadLine = new Paint();
			
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
			canvas.drawLine(40, 120, 400, 120, paintDayLine);
			canvas.drawLine(410, 120, 460, 120, paintDayLine);
			paintDays.setTextSize(10);
			paintDays.setTypeface(Typeface.create(Typeface.SANS_SERIF, Typeface.NORMAL));
			canvas.drawText(sunday, 50, 134, paintDays);
			canvas.drawText(monday, 105, 134, paintDays);
			canvas.drawText(tuesday, 160, 134, paintDays);
			canvas.drawText(wednesday, 215, 134, paintDays);
			canvas.drawText(thursday, 270, 134, paintDays);
			canvas.drawText(friday, 325, 134, paintDays);
			canvas.drawText(saturday, 370, 134, paintDays);
			paintStringOfDeadLine.setTextSize(10);
			paintStringOfDeadLine.setTypeface(Typeface.create(Typeface.SANS_SERIF, Typeface.BOLD));
			canvas.drawText(deadLine, 415, 134, paintStringOfDeadLine);
			canvas.drawLine(40, 140, 400, 140, paintDayLine);
			canvas.drawLine(410, 140, 460, 140, paintDayLine);
			paintWriteLine.setARGB(20, 0, 0, 0);
			canvas.drawLine(10, 160, 400, 160, paintWriteLine);
			paintRectangleOfDeadLine.setARGB(20, 0, 0, 0);
			paintRectangleOfDeadLine.setStyle(Paint.Style.STROKE);
			paintRectangleOfDeadLine.setStrokeWidth(2);
			canvas.drawRect(410, 165, 460, 185,paintRectangleOfDeadLine);
			canvas.drawLine(10, 190, 400, 190, paintWriteLine);
			canvas.drawRect(410, 195, 460, 215,paintRectangleOfDeadLine);
			canvas.drawLine(10, 220, 400, 220, paintWriteLine);
			canvas.drawRect(410, 225, 460, 245,paintRectangleOfDeadLine);
			canvas.drawLine(10, 250, 400, 250, paintWriteLine);
			canvas.drawRect(410, 255, 460, 275,paintRectangleOfDeadLine);
			canvas.drawLine(10, 280, 400, 280, paintWriteLine);
			canvas.drawRect(410, 285, 460, 305,paintRectangleOfDeadLine);
			canvas.drawLine(10, 310, 400, 310, paintWriteLine);
			canvas.drawRect(410, 315, 460, 335,paintRectangleOfDeadLine);
			canvas.drawLine(10, 340, 400, 340, paintWriteLine);
			canvas.drawRect(410, 345, 460, 365,paintRectangleOfDeadLine);
			canvas.drawLine(10, 370, 400, 370, paintWriteLine);
			canvas.drawRect(410, 375, 460, 395,paintRectangleOfDeadLine);
			canvas.drawLine(10, 400, 400, 400, paintWriteLine);
			canvas.drawRect(410, 405, 460, 425,paintRectangleOfDeadLine);
			canvas.drawLine(10, 430, 400, 430, paintWriteLine);
			canvas.drawRect(410, 435, 460, 455,paintRectangleOfDeadLine);
			canvas.drawLine(10, 460, 400, 460, paintWriteLine);
			canvas.drawRect(410, 465, 460, 485,paintRectangleOfDeadLine);
			canvas.drawLine(10, 490, 400, 490, paintWriteLine);
			canvas.drawRect(410, 495, 460, 515,paintRectangleOfDeadLine);
			canvas.drawLine(10, 520, 400, 520, paintWriteLine);
			canvas.drawRect(410, 525, 460, 545,paintRectangleOfDeadLine);
			canvas.drawLine(10, 550, 400, 550, paintWriteLine);
			canvas.drawRect(410, 555, 460, 575,paintRectangleOfDeadLine);
			canvas.drawLine(10, 580, 400, 580, paintWriteLine);
			canvas.drawRect(410, 585, 460, 605,paintRectangleOfDeadLine);
			canvas.drawLine(10, 610, 400, 610, paintWriteLine);
			canvas.drawRect(410, 615, 460, 635,paintRectangleOfDeadLine);
			canvas.drawLine(10, 640, 400, 640, paintWriteLine);
			canvas.drawRect(410, 645, 460, 665,paintRectangleOfDeadLine);
			canvas.drawLine(10, 670, 400, 670, paintWriteLine);
		}
	}
}
