package www.lx;

import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DatasetUtilities;

public class Bar01 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		
		String columKeys[]={"香蕉","葡萄","栗子","西瓜"};
		String rowKeys[]={"北京","上海","广州"};
		double [][] data={{100,80,60},{160,60,50},{190,30,20},{70,89,100}};
		//组装数据集合
		CategoryDataset dataset = DatasetUtilities.createCategoryDataset(columKeys,rowKeys, data);
		
		StandardChartTheme theme = new StandardChartTheme("CN");
		theme.setExtraLargeFont(new Font("隶书", Font.BOLD, 20));
		theme.setRegularFont(new Font("隶书", Font.BOLD, 20));
		theme.setLargeFont(new Font("隶书", Font.BOLD, 20));
		ChartFactory.setChartTheme(theme);
		
		JFreeChart chart = ChartFactory.createBarChart3D("水果销量图", "水果", "销量", dataset);
		ChartUtilities.writeChartAsJPEG(new FileOutputStream("d:/chart/bar02.jpg"), chart, 700, 500);
		
		System.out.println("bar ok");
		
	}

}
