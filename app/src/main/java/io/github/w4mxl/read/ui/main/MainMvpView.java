package io.github.w4mxl.read.ui.main;

import java.util.List;

import io.github.w4mxl.read.data.model.Ribot;
import io.github.w4mxl.read.ui.base.MvpView;

public interface MainMvpView extends MvpView {

    void showRibots(List<Ribot> ribots);

    void showRibotsEmpty();

    void showError();

}
