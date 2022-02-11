package ALGORITHMS;

//Решение задачи по курсу Алишева Алгоритмы и структуры данных
//определить оптимальное кол-во остановок на трассе

public class StopsOnRoad_Alishev {
    public static void main(String[] args) {
        int[] s = {0, 200, 375, 550, 750, 950};  // трасса в км
        int capacity = 400;     // емкость бака, км
        System.out.println(minStops(s, capacity));
    }

    public static int minStops(int[] s, int capacity) {
        int result = 0;        // кол-во остановок
        int currentStopIndex = 0;   // текущая остановка по счету

        while (currentStopIndex < s.length - 1) {
            int nextStop = currentStopIndex;

            while (nextStop < s.length - 1 &&
                    s[nextStop + 1] - s[currentStopIndex] <= capacity) // условие того, что расстояние между остановками
                                                                        // не дол превышать емкость бака
                nextStop++;

            if (currentStopIndex == nextStop)
                return  -1;

            if (nextStop < s.length -1)
                result++;
            currentStopIndex = nextStop;
        }

        return result;

    }
}
