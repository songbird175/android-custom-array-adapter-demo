package celina.adapterwithfragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    @BindView(R.id.lvUsers) ListView listView;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this, view);

        ArrayList<User> arrayOfUsers = User.getUsers();
        // Create the adapter to convert the array to views
        CustomUsersAdapter adapter = new CustomUsersAdapter(getContext(), arrayOfUsers);
        // Attach the adapter to a ListView
        listView.setAdapter(adapter);

        return view;
    }
}
