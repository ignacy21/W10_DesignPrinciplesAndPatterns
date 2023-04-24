package zĆwiczenia.strategy;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Sew {

    private final Sewing sewing;

    public void sewMaterial() {
        sewing.sew();
    }
}
