package com.example.SchoolBus.Tensorflow;

import java.util.ArrayList;
import java.util.List;

public class DataProcessor {
    private List<Double> feature1List;
    private List<Double> feature2List;
    private List<Double> labelList;

    public DataProcessor() {
        feature1List = new ArrayList<>();
        feature2List = new ArrayList<>();
        labelList = new ArrayList<>();
    }

    public void addData(double feature1, double feature2, double label) {
        feature1List.add(feature1);
        feature2List.add(feature2);
        labelList.add(label);
    }

    public double[][] getFeatures() {
        int n = feature1List.size();
        double[][] features = new double[n][2];
        for(int i=0; i<n; i++) {
            features[i][0] = feature1List.get(i);
            features[i][1] = feature2List.get(i);
        }
        return features;
    }

    public double[] getLabels() {
        int n = labelList.size();
        double[] labels = new double[n];
        for(int i=0; i<n; i++) {
            labels[i] = labelList.get(i);
        }
        return labels;
    }
}