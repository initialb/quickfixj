package quickfix.fix41;

import quickfix.FieldNotFound;


public class ListStatusRequest extends Message {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "M";

    public ListStatusRequest() {
        super();
        getHeader().setField(new quickfix.field.MsgType(MSGTYPE));
    }

    public ListStatusRequest(quickfix.field.ListID listID) {
        this();
        setField(listID);
    }

    public void set(quickfix.field.ListID value) {
        setField(value);
    }

    public quickfix.field.ListID get(quickfix.field.ListID value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.ListID getListID() throws FieldNotFound {
        quickfix.field.ListID value = new quickfix.field.ListID();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.ListID field) {
        return isSetField(field);
    }

    public boolean isSetListID() {
        return isSetField(66);
    }

    public void set(quickfix.field.WaveNo value) {
        setField(value);
    }

    public quickfix.field.WaveNo get(quickfix.field.WaveNo value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.WaveNo getWaveNo() throws FieldNotFound {
        quickfix.field.WaveNo value = new quickfix.field.WaveNo();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.WaveNo field) {
        return isSetField(field);
    }

    public boolean isSetWaveNo() {
        return isSetField(105);
    }

    public void set(quickfix.field.Text value) {
        setField(value);
    }

    public quickfix.field.Text get(quickfix.field.Text value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.Text getText() throws FieldNotFound {
        quickfix.field.Text value = new quickfix.field.Text();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.Text field) {
        return isSetField(field);
    }

    public boolean isSetText() {
        return isSetField(58);
    }
}
