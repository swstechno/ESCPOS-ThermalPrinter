package com.swstechno.escposprinter.barcode;

import com.swstechno.escposprinter.EscPosPrinterCommands;
import com.swstechno.escposprinter.EscPosPrinterSize;
import com.swstechno.escposprinter.exceptions.EscPosBarcodeException;

public class BarcodeUPCA extends BarcodeNumber {

    public BarcodeUPCA(EscPosPrinterSize printerSize, String code, float widthMM, float heightMM, int textPosition) throws EscPosBarcodeException {
        super(printerSize, EscPosPrinterCommands.BARCODE_TYPE_UPCA, code, widthMM, heightMM, textPosition);
    }

    @Override
    public int getCodeLength() {
        return 12;
    }
}
