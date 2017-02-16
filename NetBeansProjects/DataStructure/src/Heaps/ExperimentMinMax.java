/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Heaps;

/**
 *
 * @author Kunwar
 */
public class ExperimentMinMax
{
    public static void main(String[] args)
    {
        MinMaxHeap mmh = new MinMaxHeap();
        mmh.insert(1);
        mmh.insert(5);
        mmh.insert(7);
        mmh.insert(2);
        mmh.insert(8);
        mmh.insert(6);
        mmh.delete(7);
        System.out.println(mmh.min);
        System.out.println(mmh.max);
    }
}
