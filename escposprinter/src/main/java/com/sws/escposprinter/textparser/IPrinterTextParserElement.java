package com.sws.escposprinter.textparser;

import com.sws.escposprinter.EscPosPrinterCommands;
import com.sws.escposprinter.exceptions.EscPosConnectionException;
import com.sws.escposprinter.exceptions.EscPosEncodingException;

public interface IPrinterTextParserElement {
    int length() throws EscPosEncodingException;
    IPrinterTextParserElement print(EscPosPrinterCommands printerSocket) throws EscPosEncodingException, EscPosConnectionException;
}
