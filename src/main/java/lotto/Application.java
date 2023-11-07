package lotto;

import lotto.controller.LottoController;
import lotto.service.LottoService;
import lotto.view.InputMapper;
import lotto.view.LottoView;
import lotto.view.OutputMaker;

public class Application {

    public static void main(String[] args) {
        InputMapper inputMapper = new InputMapper();
        OutputMaker outputMaker = new OutputMaker();
        LottoView lottoView = new LottoView(inputMapper, outputMaker);
        LottoService lottoService = new LottoService();
        LottoController lottoController = new LottoController(lottoView, lottoService);
        lottoController.run();
    }
}
