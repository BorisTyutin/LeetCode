package by.tyutin.solution;

import java.util.TreeMap;

public class SnapShotArray {

    private final TreeMap<Integer, Integer>[] snapsWithArrays;
    private int snapId = 0;

    public SnapShotArray(int length) {
        snapsWithArrays = new TreeMap[length];
        for (int i = 0; i < length; i++) {
            snapsWithArrays[i] = new TreeMap<>();
            snapsWithArrays[i].put(0,0);
        }
    }

    public void set(int index, int val) {
        TreeMap<Integer, Integer> indexMap = snapsWithArrays[index];
        indexMap.put(snapId, val);
    }

    public int snap() {
        snapId++;
        return snapId - 1;
    }

    public int get(int index, int snap_id) {
        return snapsWithArrays[index].floorEntry(snap_id).getValue();
    }
}
