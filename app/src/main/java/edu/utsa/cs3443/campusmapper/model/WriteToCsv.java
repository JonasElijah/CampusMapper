package edu.utsa.cs3443.campusmapper.model;
import android.content.Context;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteToCsv
{
    private Context context;
    private List<String[]> data;

    public WriteToCsv(Context con, List<String[]> dat)
    {
        context = con;
        data = dat;
    }

    public void write(Context con, List<String[]> dat) throws IOException
    {
        String csvName = data.get(0)[0] + data.get(0)[1] +".csv";
        FileWriter csvWriter = new FileWriter(csvName);

        // Write the data to the CSV file
        for (String[] row : data) {
            csvWriter.write(String.join(",", row) + "\n");
        }

        // Close the FileWriter object
        csvWriter.close();
    }

}
