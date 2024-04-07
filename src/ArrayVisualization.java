import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ArrayVisualization {

    public static void main(String[] args) {
        // int[][] data = {
        //     {1, 2, 3},
        //     {4, 5, 6},
        //     {7, 8, 9}
        // };
        int[][] data = {{131,1,95,208,38,257,123,204,101}, 
                        {185,165,292,109,266,259,97,234,60}, 
                        {55,281,38,61,204,243,32,54,164}, 
                        {106,230,202,4,65,243,89,139,211}, 
                        {192,246,11,294,119,43,250,161,110}, 
                        {71,279,288,173,64,48,216,26,276}, 
                        {23,206,152,106,288,286,270,131,12}, 
                        {115,64,251,108,194,295,131,249,121}};

        // 创建一个默认的表格模型
        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model);

        // 添加表头
        for (int i = 0; i < data[0].length; i++) {
            model.addColumn("Column " + i);
        }
        // model.addColumn("Column 1");
        // model.addColumn("Column 2");
        // model.addColumn("Column 3");

        // 添加数据
        for (int i = 0; i < data.length; i++) {
            Object[] objs = new Object[data[0].length];
            for (int j = 0; j < objs.length; j++) {
                objs[j] = data[i][j];
            }
            model.addRow(objs);
        }

        // 创建一个带滚动条的面板
        JScrollPane scrollPane = new JScrollPane(table);

        // 创建一个窗口
        JFrame frame = new JFrame("Array Visualization");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(scrollPane);
        frame.pack();
        frame.setVisible(true);
    }
}
