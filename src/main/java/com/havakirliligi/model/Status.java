
package com.havakirliligi.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DataId",
    "StatusType",
    "Arsenik",
    "BagilNem",
    "Benzen",
    "BOS",
    "Cd",
    "CH4",
    "CO",
    "Debi",
    "Elektrik",
    "Enverziyon",
    "EtillBenzene",
    "GunesRadyasyon",
    "HavaBasinc",
    "HavaSicakligi",
    "HC",
    "Hg",
    "KabinNem",
    "KabinSicakligi",
    "mKsilen",
    "Nem",
    "Ni",
    "NMHC",
    "NO",
    "NO2",
    "NOX",
    "O3",
    "OKsilen",
    "PAH_BAP",
    "Pb",
    "pKsilen",
    "PM1",
    "PM10",
    "PM10Debi",
    "PM25",
    "PM25Debi",
    "RuzgarHizi",
    "RuzgarYon",
    "SampleFlow",
    "Sicaklik",
    "SO2",
    "SO2Test",
    "SolarRadyasyon",
    "TestChannel",
    "ToplamKsilen",
    "Toulen",
    "UVARadyasyonu",
    "UVBRadyasyon",
    "Yagmur",
    "PM10Debi_2",
    "CO_2",
    "Stationid",
    "Readtime",
    "ReadTimeGMT2",
    "Period",
    "CS_tei",
    "H2S_tei",
    "id",
    "created",
    "changed",
    "changedby",
    "createdby"
})
public class Status {

    @JsonProperty("DataId")
    private String dataId;
    @JsonProperty("StatusType")
    private Integer statusType;
    @JsonProperty("Arsenik")
    private Integer arsenik;
    @JsonProperty("BagilNem")
    private Integer bagilNem;
    @JsonProperty("Benzen")
    private Integer benzen;
    @JsonProperty("BOS")
    private Object bOS;
    @JsonProperty("Cd")
    private Integer cd;
    @JsonProperty("CH4")
    private Integer cH4;
    @JsonProperty("CO")
    private Integer cO;
    @JsonProperty("Debi")
    private Object debi;
    @JsonProperty("Elektrik")
    private Object elektrik;
    @JsonProperty("Enverziyon")
    private Integer enverziyon;
    @JsonProperty("EtillBenzene")
    private Integer etillBenzene;
    @JsonProperty("GunesRadyasyon")
    private Integer gunesRadyasyon;
    @JsonProperty("HavaBasinc")
    private Integer havaBasinc;
    @JsonProperty("HavaSicakligi")
    private Integer havaSicakligi;
    @JsonProperty("HC")
    private Integer hC;
    @JsonProperty("Hg")
    private Integer hg;
    @JsonProperty("KabinNem")
    private Integer kabinNem;
    @JsonProperty("KabinSicakligi")
    private Integer kabinSicakligi;
    @JsonProperty("mKsilen")
    private Integer mKsilen;
    @JsonProperty("Nem")
    private Object nem;
    @JsonProperty("Ni")
    private Integer ni;
    @JsonProperty("NMHC")
    private Integer nMHC;
    @JsonProperty("NO")
    private Integer nO;
    @JsonProperty("NO2")
    private Integer nO2;
    @JsonProperty("NOX")
    private Integer nOX;
    @JsonProperty("O3")
    private Integer o3;
    @JsonProperty("OKsilen")
    private Integer oKsilen;
    @JsonProperty("PAH_BAP")
    private Integer pAHBAP;
    @JsonProperty("Pb")
    private Integer pb;
    @JsonProperty("pKsilen")
    private Integer pKsilen;
    @JsonProperty("PM1")
    private Object pM1;
    @JsonProperty("PM10")
    private Integer pM10;
    @JsonProperty("PM10Debi")
    private Integer pM10Debi;
    @JsonProperty("PM25")
    private Integer pM25;
    @JsonProperty("PM25Debi")
    private Integer pM25Debi;
    @JsonProperty("RuzgarHizi")
    private Integer ruzgarHizi;
    @JsonProperty("RuzgarYon")
    private Integer ruzgarYon;
    @JsonProperty("SampleFlow")
    private Integer sampleFlow;
    @JsonProperty("Sicaklik")
    private Object sicaklik;
    @JsonProperty("SO2")
    private Integer sO2;
    @JsonProperty("SO2Test")
    private Integer sO2Test;
    @JsonProperty("SolarRadyasyon")
    private Object solarRadyasyon;
    @JsonProperty("TestChannel")
    private Object testChannel;
    @JsonProperty("ToplamKsilen")
    private Integer toplamKsilen;
    @JsonProperty("Toulen")
    private Integer toulen;
    @JsonProperty("UVARadyasyonu")
    private Integer uVARadyasyonu;
    @JsonProperty("UVBRadyasyon")
    private Integer uVBRadyasyon;
    @JsonProperty("Yagmur")
    private Object yagmur;
    @JsonProperty("PM10Debi_2")
    private Object pM10Debi2;
    @JsonProperty("CO_2")
    private Object cO2;
    @JsonProperty("Stationid")
    private String stationid;
    @JsonProperty("Readtime")
    private String readtime;
    @JsonProperty("ReadTimeGMT2")
    private String readTimeGMT2;
    @JsonProperty("Period")
    private Integer period;
    @JsonProperty("CS_tei")
    private Object cSTei;
    @JsonProperty("H2S_tei")
    private Object h2STei;
    @JsonProperty("id")
    private String id;
    @JsonProperty("created")
    private String created;
    @JsonProperty("changed")
    private Object changed;
    @JsonProperty("changedby")
    private Object changedby;
    @JsonProperty("createdby")
    private Object createdby;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("DataId")
    public String getDataId() {
        return dataId;
    }

    @JsonProperty("DataId")
    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    @JsonProperty("StatusType")
    public Integer getStatusType() {
        return statusType;
    }

    @JsonProperty("StatusType")
    public void setStatusType(Integer statusType) {
        this.statusType = statusType;
    }

    @JsonProperty("Arsenik")
    public Integer getArsenik() {
        return arsenik;
    }

    @JsonProperty("Arsenik")
    public void setArsenik(Integer arsenik) {
        this.arsenik = arsenik;
    }

    @JsonProperty("BagilNem")
    public Integer getBagilNem() {
        return bagilNem;
    }

    @JsonProperty("BagilNem")
    public void setBagilNem(Integer bagilNem) {
        this.bagilNem = bagilNem;
    }

    @JsonProperty("Benzen")
    public Integer getBenzen() {
        return benzen;
    }

    @JsonProperty("Benzen")
    public void setBenzen(Integer benzen) {
        this.benzen = benzen;
    }

    @JsonProperty("BOS")
    public Object getBOS() {
        return bOS;
    }

    @JsonProperty("BOS")
    public void setBOS(Object bOS) {
        this.bOS = bOS;
    }

    @JsonProperty("Cd")
    public Integer getCd() {
        return cd;
    }

    @JsonProperty("Cd")
    public void setCd(Integer cd) {
        this.cd = cd;
    }

    @JsonProperty("CH4")
    public Integer getCH4() {
        return cH4;
    }

    @JsonProperty("CH4")
    public void setCH4(Integer cH4) {
        this.cH4 = cH4;
    }

    @JsonProperty("CO")
    public Integer getCO() {
        return cO;
    }

    @JsonProperty("CO")
    public void setCO(Integer cO) {
        this.cO = cO;
    }

    @JsonProperty("Debi")
    public Object getDebi() {
        return debi;
    }

    @JsonProperty("Debi")
    public void setDebi(Object debi) {
        this.debi = debi;
    }

    @JsonProperty("Elektrik")
    public Object getElektrik() {
        return elektrik;
    }

    @JsonProperty("Elektrik")
    public void setElektrik(Object elektrik) {
        this.elektrik = elektrik;
    }

    @JsonProperty("Enverziyon")
    public Integer getEnverziyon() {
        return enverziyon;
    }

    @JsonProperty("Enverziyon")
    public void setEnverziyon(Integer enverziyon) {
        this.enverziyon = enverziyon;
    }

    @JsonProperty("EtillBenzene")
    public Integer getEtillBenzene() {
        return etillBenzene;
    }

    @JsonProperty("EtillBenzene")
    public void setEtillBenzene(Integer etillBenzene) {
        this.etillBenzene = etillBenzene;
    }

    @JsonProperty("GunesRadyasyon")
    public Integer getGunesRadyasyon() {
        return gunesRadyasyon;
    }

    @JsonProperty("GunesRadyasyon")
    public void setGunesRadyasyon(Integer gunesRadyasyon) {
        this.gunesRadyasyon = gunesRadyasyon;
    }

    @JsonProperty("HavaBasinc")
    public Integer getHavaBasinc() {
        return havaBasinc;
    }

    @JsonProperty("HavaBasinc")
    public void setHavaBasinc(Integer havaBasinc) {
        this.havaBasinc = havaBasinc;
    }

    @JsonProperty("HavaSicakligi")
    public Integer getHavaSicakligi() {
        return havaSicakligi;
    }

    @JsonProperty("HavaSicakligi")
    public void setHavaSicakligi(Integer havaSicakligi) {
        this.havaSicakligi = havaSicakligi;
    }

    @JsonProperty("HC")
    public Integer getHC() {
        return hC;
    }

    @JsonProperty("HC")
    public void setHC(Integer hC) {
        this.hC = hC;
    }

    @JsonProperty("Hg")
    public Integer getHg() {
        return hg;
    }

    @JsonProperty("Hg")
    public void setHg(Integer hg) {
        this.hg = hg;
    }

    @JsonProperty("KabinNem")
    public Integer getKabinNem() {
        return kabinNem;
    }

    @JsonProperty("KabinNem")
    public void setKabinNem(Integer kabinNem) {
        this.kabinNem = kabinNem;
    }

    @JsonProperty("KabinSicakligi")
    public Integer getKabinSicakligi() {
        return kabinSicakligi;
    }

    @JsonProperty("KabinSicakligi")
    public void setKabinSicakligi(Integer kabinSicakligi) {
        this.kabinSicakligi = kabinSicakligi;
    }

    @JsonProperty("mKsilen")
    public Integer getMKsilen() {
        return mKsilen;
    }

    @JsonProperty("mKsilen")
    public void setMKsilen(Integer mKsilen) {
        this.mKsilen = mKsilen;
    }

    @JsonProperty("Nem")
    public Object getNem() {
        return nem;
    }

    @JsonProperty("Nem")
    public void setNem(Object nem) {
        this.nem = nem;
    }

    @JsonProperty("Ni")
    public Integer getNi() {
        return ni;
    }

    @JsonProperty("Ni")
    public void setNi(Integer ni) {
        this.ni = ni;
    }

    @JsonProperty("NMHC")
    public Integer getNMHC() {
        return nMHC;
    }

    @JsonProperty("NMHC")
    public void setNMHC(Integer nMHC) {
        this.nMHC = nMHC;
    }

    @JsonProperty("NO")
    public Integer getNO() {
        return nO;
    }

    @JsonProperty("NO")
    public void setNO(Integer nO) {
        this.nO = nO;
    }

    @JsonProperty("NO2")
    public Integer getNO2() {
        return nO2;
    }

    @JsonProperty("NO2")
    public void setNO2(Integer nO2) {
        this.nO2 = nO2;
    }

    @JsonProperty("NOX")
    public Integer getNOX() {
        return nOX;
    }

    @JsonProperty("NOX")
    public void setNOX(Integer nOX) {
        this.nOX = nOX;
    }

    @JsonProperty("O3")
    public Integer getO3() {
        return o3;
    }

    @JsonProperty("O3")
    public void setO3(Integer o3) {
        this.o3 = o3;
    }

    @JsonProperty("OKsilen")
    public Integer getOKsilen() {
        return oKsilen;
    }

    @JsonProperty("OKsilen")
    public void setOKsilen(Integer oKsilen) {
        this.oKsilen = oKsilen;
    }

    @JsonProperty("PAH_BAP")
    public Integer getPAHBAP() {
        return pAHBAP;
    }

    @JsonProperty("PAH_BAP")
    public void setPAHBAP(Integer pAHBAP) {
        this.pAHBAP = pAHBAP;
    }

    @JsonProperty("Pb")
    public Integer getPb() {
        return pb;
    }

    @JsonProperty("Pb")
    public void setPb(Integer pb) {
        this.pb = pb;
    }

    @JsonProperty("pKsilen")
    public Integer getPKsilen() {
        return pKsilen;
    }

    @JsonProperty("pKsilen")
    public void setPKsilen(Integer pKsilen) {
        this.pKsilen = pKsilen;
    }

    @JsonProperty("PM1")
    public Object getPM1() {
        return pM1;
    }

    @JsonProperty("PM1")
    public void setPM1(Object pM1) {
        this.pM1 = pM1;
    }

    @JsonProperty("PM10")
    public Integer getPM10() {
        return pM10;
    }

    @JsonProperty("PM10")
    public void setPM10(Integer pM10) {
        this.pM10 = pM10;
    }

    @JsonProperty("PM10Debi")
    public Integer getPM10Debi() {
        return pM10Debi;
    }

    @JsonProperty("PM10Debi")
    public void setPM10Debi(Integer pM10Debi) {
        this.pM10Debi = pM10Debi;
    }

    @JsonProperty("PM25")
    public Integer getPM25() {
        return pM25;
    }

    @JsonProperty("PM25")
    public void setPM25(Integer pM25) {
        this.pM25 = pM25;
    }

    @JsonProperty("PM25Debi")
    public Integer getPM25Debi() {
        return pM25Debi;
    }

    @JsonProperty("PM25Debi")
    public void setPM25Debi(Integer pM25Debi) {
        this.pM25Debi = pM25Debi;
    }

    @JsonProperty("RuzgarHizi")
    public Integer getRuzgarHizi() {
        return ruzgarHizi;
    }

    @JsonProperty("RuzgarHizi")
    public void setRuzgarHizi(Integer ruzgarHizi) {
        this.ruzgarHizi = ruzgarHizi;
    }

    @JsonProperty("RuzgarYon")
    public Integer getRuzgarYon() {
        return ruzgarYon;
    }

    @JsonProperty("RuzgarYon")
    public void setRuzgarYon(Integer ruzgarYon) {
        this.ruzgarYon = ruzgarYon;
    }

    @JsonProperty("SampleFlow")
    public Integer getSampleFlow() {
        return sampleFlow;
    }

    @JsonProperty("SampleFlow")
    public void setSampleFlow(Integer sampleFlow) {
        this.sampleFlow = sampleFlow;
    }

    @JsonProperty("Sicaklik")
    public Object getSicaklik() {
        return sicaklik;
    }

    @JsonProperty("Sicaklik")
    public void setSicaklik(Object sicaklik) {
        this.sicaklik = sicaklik;
    }

    @JsonProperty("SO2")
    public Integer getSO2() {
        return sO2;
    }

    @JsonProperty("SO2")
    public void setSO2(Integer sO2) {
        this.sO2 = sO2;
    }

    @JsonProperty("SO2Test")
    public Integer getSO2Test() {
        return sO2Test;
    }

    @JsonProperty("SO2Test")
    public void setSO2Test(Integer sO2Test) {
        this.sO2Test = sO2Test;
    }

    @JsonProperty("SolarRadyasyon")
    public Object getSolarRadyasyon() {
        return solarRadyasyon;
    }

    @JsonProperty("SolarRadyasyon")
    public void setSolarRadyasyon(Object solarRadyasyon) {
        this.solarRadyasyon = solarRadyasyon;
    }

    @JsonProperty("TestChannel")
    public Object getTestChannel() {
        return testChannel;
    }

    @JsonProperty("TestChannel")
    public void setTestChannel(Object testChannel) {
        this.testChannel = testChannel;
    }

    @JsonProperty("ToplamKsilen")
    public Integer getToplamKsilen() {
        return toplamKsilen;
    }

    @JsonProperty("ToplamKsilen")
    public void setToplamKsilen(Integer toplamKsilen) {
        this.toplamKsilen = toplamKsilen;
    }

    @JsonProperty("Toulen")
    public Integer getToulen() {
        return toulen;
    }

    @JsonProperty("Toulen")
    public void setToulen(Integer toulen) {
        this.toulen = toulen;
    }

    @JsonProperty("UVARadyasyonu")
    public Integer getUVARadyasyonu() {
        return uVARadyasyonu;
    }

    @JsonProperty("UVARadyasyonu")
    public void setUVARadyasyonu(Integer uVARadyasyonu) {
        this.uVARadyasyonu = uVARadyasyonu;
    }

    @JsonProperty("UVBRadyasyon")
    public Integer getUVBRadyasyon() {
        return uVBRadyasyon;
    }

    @JsonProperty("UVBRadyasyon")
    public void setUVBRadyasyon(Integer uVBRadyasyon) {
        this.uVBRadyasyon = uVBRadyasyon;
    }

    @JsonProperty("Yagmur")
    public Object getYagmur() {
        return yagmur;
    }

    @JsonProperty("Yagmur")
    public void setYagmur(Object yagmur) {
        this.yagmur = yagmur;
    }

    @JsonProperty("PM10Debi_2")
    public Object getPM10Debi2() {
        return pM10Debi2;
    }

    @JsonProperty("PM10Debi_2")
    public void setPM10Debi2(Object pM10Debi2) {
        this.pM10Debi2 = pM10Debi2;
    }

    @JsonProperty("CO_2")
    public Object getCO2() {
        return cO2;
    }

    @JsonProperty("CO_2")
    public void setCO2(Object cO2) {
        this.cO2 = cO2;
    }

    @JsonProperty("Stationid")
    public String getStationid() {
        return stationid;
    }

    @JsonProperty("Stationid")
    public void setStationid(String stationid) {
        this.stationid = stationid;
    }

    @JsonProperty("Readtime")
    public String getReadtime() {
        return readtime;
    }

    @JsonProperty("Readtime")
    public void setReadtime(String readtime) {
        this.readtime = readtime;
    }

    @JsonProperty("ReadTimeGMT2")
    public String getReadTimeGMT2() {
        return readTimeGMT2;
    }

    @JsonProperty("ReadTimeGMT2")
    public void setReadTimeGMT2(String readTimeGMT2) {
        this.readTimeGMT2 = readTimeGMT2;
    }

    @JsonProperty("Period")
    public Integer getPeriod() {
        return period;
    }

    @JsonProperty("Period")
    public void setPeriod(Integer period) {
        this.period = period;
    }

    @JsonProperty("CS_tei")
    public Object getCSTei() {
        return cSTei;
    }

    @JsonProperty("CS_tei")
    public void setCSTei(Object cSTei) {
        this.cSTei = cSTei;
    }

    @JsonProperty("H2S_tei")
    public Object getH2STei() {
        return h2STei;
    }

    @JsonProperty("H2S_tei")
    public void setH2STei(Object h2STei) {
        this.h2STei = h2STei;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("changed")
    public Object getChanged() {
        return changed;
    }

    @JsonProperty("changed")
    public void setChanged(Object changed) {
        this.changed = changed;
    }

    @JsonProperty("changedby")
    public Object getChangedby() {
        return changedby;
    }

    @JsonProperty("changedby")
    public void setChangedby(Object changedby) {
        this.changedby = changedby;
    }

    @JsonProperty("createdby")
    public Object getCreatedby() {
        return createdby;
    }

    @JsonProperty("createdby")
    public void setCreatedby(Object createdby) {
        this.createdby = createdby;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
