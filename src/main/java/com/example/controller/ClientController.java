/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2016 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.example.controller;

import com.example.entity.Client;
import com.example.service.ClientService;
import com.github.pagehelper.PageInfo;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


/**
 * @author liuzh
 * @since 2015-12-19 11:10
 */
@RestController
@RequestMapping("/client")
public class ClientController {

	@Autowired
	private ClientService clientService;

	@RequestMapping
	public PageInfo<Client> getAll(Client Client) {
		List<Client> countryList = clientService.getAll(Client);
		return new PageInfo<Client>(countryList);
	}

	@RequestMapping(value = "/add")
	public Client add() {
		return new Client();
	}

	@RequestMapping(value = "/view/{id}")
	public Client view(@PathVariable Integer id) {
		ModelAndView result = new ModelAndView();
		Client Client = clientService.getById(id);
		return Client;
	}

	@RequestMapping(value = "/delete/{id}")
	public ModelMap delete(@PathVariable Integer id) {
		ModelMap result = new ModelMap();
		clientService.deleteById(id);
		result.put("msg", "删除成功!");
		return result;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelMap save(Client client) {
		ModelMap result = new ModelMap();
		String msg = client.getId() == null ? "新增成功!" : "更新成功!";
		client.setUpdTime(new Date());
		clientService.save(client);
		result.put("Client", client);
		result.put("msg", msg);
		return result;
	}
}
