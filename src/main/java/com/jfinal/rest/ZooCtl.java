package com.jfinal.rest;

import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Record;
import com.jfinal.restful.Method;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * Created by iaceob on 2017/3/17.
 */
public class ZooCtl extends Controller {

    private List<Record> getAttrs() {
        List<Record> rets = new ArrayList<Record>();
        Enumeration<String> ens = super.getAttrNames();
        while (ens.hasMoreElements()) {
            String key = ens.nextElement();
            rets.add(new Record().set(key, super.getAttr(key)));
        }
        return rets;
    }

    private Record buildRet(String intro) {
        Record ret = new Record();
        ret.set("intro", intro)
                .set("attrs", this.getAttrs())
                .set("paras", super.getParaMap());
        return ret;
    }

    @ActionKey("/zoo")
    public void list() {
        super.renderJson(this.buildRet("zoo list"));
    }

    @ActionKey(value = "/zoo", method = Method.POST)
    public void addZoo() {
        super.renderJson(this.buildRet("add zoo"));
    }

    @ActionKey("/zoo/:id")
    public void getZoo() {
        super.renderJson(this.buildRet("get zoo by id"));
    }

    @ActionKey(value = "/zoo/:id", method = Method.PUT)
    public void putZoo() {
        super.renderJson(this.buildRet("put zoo by id"));
    }

    @ActionKey(value = "/zoo/:id", method = Method.PATCH)
    public void patchZoo() {
        super.renderJson(this.buildRet("patch zoo by id"));
    }

    @ActionKey(value = "/zoo/:id", method = Method.DELETE)
    public void deleteZoo() {
        super.renderJson(this.buildRet("delete zoo by id"));
    }

    @ActionKey("/zoo/:id/animals")
    public void animals() {
        super.renderJson(this.buildRet("show zoo animals"));
    }

    @ActionKey("/zoo/:zooId/animal/:animalId")
    public void getAnimal() {
        super.renderJson(this.buildRet("show zoo animal by id"));
    }

    @ActionKey("/zoo/:zid/animal2/:aid")
    public void getAnimal2() {
        super.renderJson(this.buildRet("show zoo animal by id, 2"));
    }

}
