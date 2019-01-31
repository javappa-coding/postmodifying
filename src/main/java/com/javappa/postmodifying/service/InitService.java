package com.javappa.postmodifying.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javappa.postmodifying.domain.Item;
import com.javappa.postmodifying.domain.User;
import com.javappa.postmodifying.repository.ItemRepository;
import com.javappa.postmodifying.repository.UserRepository;

@Service
public class InitService {

	private static final int GENERATED_ITEMS_NUMBER = 10;

	private static final String DUMMY_USER = "kowalski.jan@javappa.com";

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ItemRepository itemRepository;

	public void initUser() throws Exception {

		User user = new User();
		user.setEmail(DUMMY_USER);

		userRepository.save(user);
	}

	public void initItems() throws Exception {

		User user = userRepository.findByEmail(DUMMY_USER);
		List<Item> items = new ArrayList<>();
		for (int i = 1; i <= GENERATED_ITEMS_NUMBER; i++) {

			Item item = new Item();

			if (i % 2 == 0) {
				item.setName("Item " + i);
				item.setDescription("Item " + i + " description");
				item.getUsers().add(user);
			} else {
				item.setName("AppaItem " + i);
				item.setDescription("AppaItem " + i + " description");
			}

			items.add(item);

		}
		itemRepository.save(items);
	}
}
