package oracle.mau.main.message.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by shadow on 2017/3/2.
 */

public class MsgFragmentPageAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> list;

    public MsgFragmentPageAdapter(FragmentManager fm, ArrayList<Fragment> list) {
        super(fm);
        this.list = list;

    }
    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
