package quickfix.fix44.component;

import quickfix.FieldNotFound;
import quickfix.Group;


public class SettlInstructionsData extends quickfix.MessageComponent {
    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "";
    private int[] componentFields = { 172, 169, 170, 171, };
    private int[] componentGroups = { 85, };

    public SettlInstructionsData() {
        super();
    }

    protected int[] getFields() {
        return componentFields;
    }

    protected int[] getGroupFields() {
        return componentGroups;
    }

    public void set(quickfix.field.SettlDeliveryType value) {
        setField(value);
    }

    public quickfix.field.SettlDeliveryType get(
        quickfix.field.SettlDeliveryType value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.SettlDeliveryType getSettlDeliveryType()
        throws FieldNotFound {
        quickfix.field.SettlDeliveryType value = new quickfix.field.SettlDeliveryType();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.SettlDeliveryType field) {
        return isSetField(field);
    }

    public boolean isSetSettlDeliveryType() {
        return isSetField(172);
    }

    public void set(quickfix.field.StandInstDbType value) {
        setField(value);
    }

    public quickfix.field.StandInstDbType get(
        quickfix.field.StandInstDbType value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.StandInstDbType getStandInstDbType()
        throws FieldNotFound {
        quickfix.field.StandInstDbType value = new quickfix.field.StandInstDbType();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.StandInstDbType field) {
        return isSetField(field);
    }

    public boolean isSetStandInstDbType() {
        return isSetField(169);
    }

    public void set(quickfix.field.StandInstDbName value) {
        setField(value);
    }

    public quickfix.field.StandInstDbName get(
        quickfix.field.StandInstDbName value) throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.StandInstDbName getStandInstDbName()
        throws FieldNotFound {
        quickfix.field.StandInstDbName value = new quickfix.field.StandInstDbName();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.StandInstDbName field) {
        return isSetField(field);
    }

    public boolean isSetStandInstDbName() {
        return isSetField(170);
    }

    public void set(quickfix.field.StandInstDbID value) {
        setField(value);
    }

    public quickfix.field.StandInstDbID get(quickfix.field.StandInstDbID value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.StandInstDbID getStandInstDbID()
        throws FieldNotFound {
        quickfix.field.StandInstDbID value = new quickfix.field.StandInstDbID();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.StandInstDbID field) {
        return isSetField(field);
    }

    public boolean isSetStandInstDbID() {
        return isSetField(171);
    }

    public void set(quickfix.field.NoDlvyInst value) {
        setField(value);
    }

    public quickfix.field.NoDlvyInst get(quickfix.field.NoDlvyInst value)
        throws FieldNotFound {
        getField(value);

        return value;
    }

    public quickfix.field.NoDlvyInst getNoDlvyInst() throws FieldNotFound {
        quickfix.field.NoDlvyInst value = new quickfix.field.NoDlvyInst();
        getField(value);

        return value;
    }

    public boolean isSet(quickfix.field.NoDlvyInst field) {
        return isSetField(field);
    }

    public boolean isSetNoDlvyInst() {
        return isSetField(85);
    }

    public static class NoDlvyInst extends Group {
        static final long serialVersionUID = 20050617;

        public NoDlvyInst() {
            super(85, 165, new int[] { 165, 787, 781, 0 });
        }

        public void set(quickfix.field.SettlInstSource value) {
            setField(value);
        }

        public quickfix.field.SettlInstSource get(
            quickfix.field.SettlInstSource value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.SettlInstSource getSettlInstSource()
            throws FieldNotFound {
            quickfix.field.SettlInstSource value = new quickfix.field.SettlInstSource();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.SettlInstSource field) {
            return isSetField(field);
        }

        public boolean isSetSettlInstSource() {
            return isSetField(165);
        }

        public void set(quickfix.field.DlvyInstType value) {
            setField(value);
        }

        public quickfix.field.DlvyInstType get(
            quickfix.field.DlvyInstType value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.DlvyInstType getDlvyInstType()
            throws FieldNotFound {
            quickfix.field.DlvyInstType value = new quickfix.field.DlvyInstType();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.DlvyInstType field) {
            return isSetField(field);
        }

        public boolean isSetDlvyInstType() {
            return isSetField(787);
        }

        public void set(quickfix.fix44.component.SettlParties component) {
            setComponent(component);
        }

        public quickfix.fix44.component.SettlParties get(
            quickfix.fix44.component.SettlParties component)
            throws FieldNotFound {
            getComponent(component);

            return component;
        }

        public quickfix.fix44.component.SettlParties getSettlParties()
            throws FieldNotFound {
            quickfix.fix44.component.SettlParties component = new quickfix.fix44.component.SettlParties();
            getComponent(component);

            return component;
        }

        public void set(quickfix.field.NoSettlPartyIDs value) {
            setField(value);
        }

        public quickfix.field.NoSettlPartyIDs get(
            quickfix.field.NoSettlPartyIDs value) throws FieldNotFound {
            getField(value);

            return value;
        }

        public quickfix.field.NoSettlPartyIDs getNoSettlPartyIDs()
            throws FieldNotFound {
            quickfix.field.NoSettlPartyIDs value = new quickfix.field.NoSettlPartyIDs();
            getField(value);

            return value;
        }

        public boolean isSet(quickfix.field.NoSettlPartyIDs field) {
            return isSetField(field);
        }

        public boolean isSetNoSettlPartyIDs() {
            return isSetField(781);
        }

        public static class NoSettlPartyIDs extends Group {
            static final long serialVersionUID = 20050617;

            public NoSettlPartyIDs() {
                super(781, 782, new int[] { 782, 783, 784, 801, 0 });
            }

            public void set(quickfix.field.SettlPartyID value) {
                setField(value);
            }

            public quickfix.field.SettlPartyID get(
                quickfix.field.SettlPartyID value) throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.SettlPartyID getSettlPartyID()
                throws FieldNotFound {
                quickfix.field.SettlPartyID value = new quickfix.field.SettlPartyID();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.SettlPartyID field) {
                return isSetField(field);
            }

            public boolean isSetSettlPartyID() {
                return isSetField(782);
            }

            public void set(quickfix.field.SettlPartyIDSource value) {
                setField(value);
            }

            public quickfix.field.SettlPartyIDSource get(
                quickfix.field.SettlPartyIDSource value)
                throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.SettlPartyIDSource getSettlPartyIDSource()
                throws FieldNotFound {
                quickfix.field.SettlPartyIDSource value = new quickfix.field.SettlPartyIDSource();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.SettlPartyIDSource field) {
                return isSetField(field);
            }

            public boolean isSetSettlPartyIDSource() {
                return isSetField(783);
            }

            public void set(quickfix.field.SettlPartyRole value) {
                setField(value);
            }

            public quickfix.field.SettlPartyRole get(
                quickfix.field.SettlPartyRole value) throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.SettlPartyRole getSettlPartyRole()
                throws FieldNotFound {
                quickfix.field.SettlPartyRole value = new quickfix.field.SettlPartyRole();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.SettlPartyRole field) {
                return isSetField(field);
            }

            public boolean isSetSettlPartyRole() {
                return isSetField(784);
            }

            public void set(quickfix.field.NoSettlPartySubIDs value) {
                setField(value);
            }

            public quickfix.field.NoSettlPartySubIDs get(
                quickfix.field.NoSettlPartySubIDs value)
                throws FieldNotFound {
                getField(value);

                return value;
            }

            public quickfix.field.NoSettlPartySubIDs getNoSettlPartySubIDs()
                throws FieldNotFound {
                quickfix.field.NoSettlPartySubIDs value = new quickfix.field.NoSettlPartySubIDs();
                getField(value);

                return value;
            }

            public boolean isSet(quickfix.field.NoSettlPartySubIDs field) {
                return isSetField(field);
            }

            public boolean isSetNoSettlPartySubIDs() {
                return isSetField(801);
            }

            public static class NoSettlPartySubIDs extends Group {
                static final long serialVersionUID = 20050617;

                public NoSettlPartySubIDs() {
                    super(801, 785, new int[] { 785, 786, 0 });
                }

                public void set(quickfix.field.SettlPartySubID value) {
                    setField(value);
                }

                public quickfix.field.SettlPartySubID get(
                    quickfix.field.SettlPartySubID value)
                    throws FieldNotFound {
                    getField(value);

                    return value;
                }

                public quickfix.field.SettlPartySubID getSettlPartySubID()
                    throws FieldNotFound {
                    quickfix.field.SettlPartySubID value = new quickfix.field.SettlPartySubID();
                    getField(value);

                    return value;
                }

                public boolean isSet(quickfix.field.SettlPartySubID field) {
                    return isSetField(field);
                }

                public boolean isSetSettlPartySubID() {
                    return isSetField(785);
                }

                public void set(quickfix.field.SettlPartySubIDType value) {
                    setField(value);
                }

                public quickfix.field.SettlPartySubIDType get(
                    quickfix.field.SettlPartySubIDType value)
                    throws FieldNotFound {
                    getField(value);

                    return value;
                }

                public quickfix.field.SettlPartySubIDType getSettlPartySubIDType()
                    throws FieldNotFound {
                    quickfix.field.SettlPartySubIDType value = new quickfix.field.SettlPartySubIDType();
                    getField(value);

                    return value;
                }

                public boolean isSet(quickfix.field.SettlPartySubIDType field) {
                    return isSetField(field);
                }

                public boolean isSetSettlPartySubIDType() {
                    return isSetField(786);
                }
            }
        }
    }
}
