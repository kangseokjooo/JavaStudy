package java_algorithm_study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Algo_24 {
	static class Point{
		int x,y;
	Point(int x,int y) {
			this.x=x;
			this.y=y;
		}
	}
	public static void main(String arg[]) {
		Scanner s=new Scanner(System.in);
		Point A=new Point(s.nextInt(),s.nextInt());
		Point B=new Point(s.nextInt(),s.nextInt());
		Point C=new Point(s.nextInt(),s.nextInt());
		
		int N=s.nextInt();
		List<Point> tree=new ArrayList<>();
		for(int i=0;i<N;i++) {
			tree.add(new Point(s.nextInt(),s.nextInt()));
		}
		
		double area=Area(A,B,C);
		int cnt=0;
		
		for(Point t:tree) {
			double a1 = Area(t, A, B);
            double a2 = Area(t, B, C);
            double a3 = Area(t, C, A);
            double total = a1 + a2 + a3;

          
            if (Math.abs(total - area) <= 1e-6) {
                cnt++;
		}
	}
		System.out.printf("%.1f\n", area);
        System.out.println(cnt);
	}
	 static double Area(Point p1, Point p2, Point p3) {
	        return Math.abs(p1.x * (p2.y - p3.y)
	                      + p2.x * (p3.y - p1.y)
	                      + p3.x * (p1.y - p2.y)) / 2.0;
	    }
	 //BJ2987
}
