package www.lx;

import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.data.category.DefaultCategoryDataset;

public class Bar2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		
		dataset.addValue(100, "上海", "香蕉");
		dataset.addValue(80, "上海", "苹果");
		dataset.addValue(60, "上海", "草莓");
		dataset.addValue(130, "上海", "橘子");
		
		StandardChartTheme theme = new StandardChartTheme("CN");
		theme.setExtraLargeFont(new Font("隶书", Font.BOLD, 20));
		theme.setRegularFont(new Font("隶书", Font.BOLD, 20));
		theme.setLargeFont(new Font("隶书", Font.BOLD, 20));
		ChartFactory.setChartTheme(theme);
		
		JFreeChart chart = ChartFactory.createBarChart3D("水果销量图", "水果", "销量", dataset);
		ChartUtilities.writeChartAsJPEG(new FileOutputStream("d:/chart/bar01.jpg"), chart, 700, 500);
		
		System.out.println("bar ok");
		
	}

}
