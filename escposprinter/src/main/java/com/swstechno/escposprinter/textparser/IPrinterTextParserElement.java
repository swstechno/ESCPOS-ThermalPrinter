package com.swstechno.escposprinter.textparser;

import com.swstechno.escposprinter.EscPosPrinterCommands;
import com.swstechno.escposprinter.exceptions.EscPosConnectionException;
import com.swstechno.escposprinter.exceptions.EscPosEncodingException;

public interface IPrinterTextParserElement {
    int length() throws EscPosEncodingException;
    IPrinterTextParserElement print(EscPosPrinterCommands printerSocket) throws EscPosEncodingException, EscPosConnectionException;
}
