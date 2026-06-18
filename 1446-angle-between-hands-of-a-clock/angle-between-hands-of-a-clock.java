class Solution {
    public double angleClock(int hour, int minutes) {
         double hourangle = 30 * hour + 0.5 * minutes;
         double minangle=6*minutes;
         double angle=Math.abs(hourangle-minangle);
        return Math.min(angle, 360 - angle);
    }
}