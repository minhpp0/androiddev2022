package vn.edu.usth.usthweather;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class AdapterPage extends FragmentPagerAdapter {
    private final int PAGE_COUNT = 3;
    private String titles[] = new String[] { "Tokyo", "Ha Noi", "Seoul" };
    public AdapterPage(FragmentManager fm) {
        super(fm);
    }
    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
    @Override
    public Fragment getItem(int page) {


        return new WeatherAndForecastFragment();

    }
    @Override
    public CharSequence getPageTitle(int page) {

        return titles[page];
    }
}
