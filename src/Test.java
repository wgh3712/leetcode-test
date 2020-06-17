import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		// 当前精确时间
		LocalDateTime now = LocalDateTime.now();
		System.out.println("当前精确时间：" + now);
		System.out.println("当前精确时间：" + now.getYear() + "-" + now.getMonthValue() + "-" + now.getDayOfMonth() + " "
				+ now.getHour() + "-" + now.getMinute() + "-" + now.getSecond());

		LocalDateTime local = LocalDateTime.ofInstant(new Date().toInstant(), ZoneId.systemDefault());
		System.out.println(local);
		// 获取当前日期
		LocalDate localDate = LocalDate.now();
		System.out.println("当前日期：" + localDate);
		System.out.println(
				"当前日期：" + localDate.getYear() + "-" + localDate.getMonthValue() + "-" + localDate.getDayOfMonth());

		// 获取当天时间
		LocalTime localTime = LocalTime.now();
		System.out.println("当天时间：" + localTime);
		System.out.println("当天时间：" + localTime.getHour() + ":" + localTime.getMinute() + ":" + localTime.getSecond());

		// 有时区的当前精确时间
		ZonedDateTime nowZone = LocalDateTime.now().atZone(ZoneId.systemDefault());
		System.out.println("当前精确时间（有时区）：" + nowZone);
		System.out.println("当前精确时间（有时区）：" + nowZone.getYear() + "-" + nowZone.getMonthValue());
		ArrayList<String> list = new ArrayList<>(5);
		System.out.println(list.size());
		list.add(0, "111");
		list.add("333");
		list.add("333");
		list.add("333");
		list.add(3, "22");

	}

}
