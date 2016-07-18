package navigation.garciano.com.navigation;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class SalesFragment extends Fragment{

    View rootView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_sales,container,false);


       // BarChart salesChart = (BarChart) rootView.findViewById(R.id.chartSales);
        HorizontalBarChart salesChart = (HorizontalBarChart) rootView.findViewById(R.id.chartSales);

        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(100f, 0));
        entries.add(new BarEntry(200f, 1));
        entries.add(new BarEntry(300f, 2));
        entries.add(new BarEntry(400f, 3));
        entries.add(new BarEntry(500f, 4));
        entries.add(new BarEntry(400f, 5));


        BarDataSet dataset = new BarDataSet(entries, "# of Sales");
        dataset.setValueTextSize(30f);




        ArrayList<String> labels = new ArrayList<String>();
        labels.add("Banilad");
        labels.add("Colon");
        labels.add("Pardo");
        labels.add("Mambaling");
        labels.add("Mandaue");
        labels.add("Lapu-Lapu");


        /* for create Grouped Bar chart
        ArrayList<BarEntry> group1 = new ArrayList<>();
        group1.add(new BarEntry(4f, 0));
        group1.add(new BarEntry(8f, 1));
        group1.add(new BarEntry(6f, 2));
        group1.add(new BarEntry(12f, 3));
        group1.add(new BarEntry(18f, 4));
        group1.add(new BarEntry(9f, 5));

        ArrayList<BarEntry> group2 = new ArrayList<>();
        group2.add(new BarEntry(6f, 0));
        group2.add(new BarEntry(7f, 1));
        group2.add(new BarEntry(8f, 2));
        group2.add(new BarEntry(12f, 3));
        group2.add(new BarEntry(15f, 4));
        group2.add(new BarEntry(10f, 5));

        BarDataSet barDataSet1 = new BarDataSet(group1, "Group 1");
        barDataSet1.setColor(Color.rgb(0, 155, 0));
        barDataSet1.setColors(ColorTemplate.COLORFUL_COLORS);

        BarDataSet barDataSet2 = new BarDataSet(group2, "Group 2");
        barDataSet2.setColors(ColorTemplate.COLORFUL_COLORS);

        ArrayList<BarDataSet> dataset = new ArrayList<>();
        dataset.add(barDataSet1);
        dataset.add(barDataSet2);
        */

        BarData data = new BarData(labels, dataset);
        dataset.setColors(ColorTemplate.COLORFUL_COLORS);
        salesChart.setData(data);
        //barChart.setBackgroundColor(Color.rgb(0, 155, 0));
        salesChart.setDescription("This is the total sales of each branch");
        salesChart.setDescriptionTextSize(33f);
        salesChart.animateY(5000);

        return rootView;


    }


    //    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.fragment_sales);
//
//
//
//
//        BarChart salesChart = (BarChart) findViewById(R.id.chartSales);
//
//        ArrayList<BarEntry> entries = new ArrayList<>();
//        entries.add(new BarEntry(1000f, 0));
//        entries.add(new BarEntry(1000f, 1));
//        entries.add(new BarEntry(1000f, 2));
//        entries.add(new BarEntry(1000f, 3));
//        entries.add(new BarEntry(1000f, 4));
//        entries.add(new BarEntry(1000f, 5));
//
//
//        BarDataSet dataset = new BarDataSet(entries, "# of Sales");
//        dataset.setValueTextSize(30f);
//
//
//        ArrayList<String> labels = new ArrayList<String>();
//        labels.add("Banilad");
//        labels.add("Colon");
//        labels.add("Pardo");
//        labels.add("Mambaling");
//        labels.add("Mandaue");
//        labels.add("Lapu-Lapu");
//
//
//        /* for create Grouped Bar chart
//        ArrayList<BarEntry> group1 = new ArrayList<>();
//        group1.add(new BarEntry(4f, 0));
//        group1.add(new BarEntry(8f, 1));
//        group1.add(new BarEntry(6f, 2));
//        group1.add(new BarEntry(12f, 3));
//        group1.add(new BarEntry(18f, 4));
//        group1.add(new BarEntry(9f, 5));
//
//        ArrayList<BarEntry> group2 = new ArrayList<>();
//        group2.add(new BarEntry(6f, 0));
//        group2.add(new BarEntry(7f, 1));
//        group2.add(new BarEntry(8f, 2));
//        group2.add(new BarEntry(12f, 3));
//        group2.add(new BarEntry(15f, 4));
//        group2.add(new BarEntry(10f, 5));
//
//        BarDataSet barDataSet1 = new BarDataSet(group1, "Group 1");
//        barDataSet1.setColor(Color.rgb(0, 155, 0));
//        barDataSet1.setColors(ColorTemplate.COLORFUL_COLORS);
//
//        BarDataSet barDataSet2 = new BarDataSet(group2, "Group 2");
//        barDataSet2.setColors(ColorTemplate.COLORFUL_COLORS);
//
//        ArrayList<BarDataSet> dataset = new ArrayList<>();
//        dataset.add(barDataSet1);
//        dataset.add(barDataSet2);
//        */
//
//        BarData data = new BarData(labels, dataset);
//        // dataset.setColors(ColorTemplate.COLORFUL_COLORS); //
//        salesChart.setData(data);
//        //barChart.setBackgroundColor(Color.rgb(0, 155, 0));
//        salesChart.setDescription("This is the total sales of each branch");
//        salesChart.setDescriptionTextSize(33f);
//        salesChart.animateY(5000);
//
//    }

    }

