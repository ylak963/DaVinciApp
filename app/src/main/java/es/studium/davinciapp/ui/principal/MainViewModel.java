package es.studium.davinciapp.ui.principal;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel
{

    private MutableLiveData<String> mText;

    public MainViewModel()
    {
        mText = new MutableLiveData<>();
        mText.setValue("Información básica acerca de Leonardo Da Vinci");
    }

    public LiveData<String> getText() {
        return mText;
    }

}
