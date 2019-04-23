/*********************************************************************
 * Copyright (c) 2019 Red Hat, Inc.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 **********************************************************************/
import 'chromedriver';
import 'reflect-metadata';
import { injectable, inject } from "inversify";
import { ThenableWebDriver, Builder } from "selenium-webdriver";
import { Driver } from './Driver';
import { Options } from 'selenium-webdriver/chrome';
import { TestConstants } from '../TestConstants';

@injectable()
export class ChromeDriver implements Driver {
    private readonly driver: ThenableWebDriver;

    constructor() {
        const isHeadless: boolean = TestConstants.TS_SELENIUM_HEADLESS;
        let options: Options = new Options().addArguments('--no-sandbox')

        if (isHeadless) {
            options = options.addArguments('headless')
        }

        this.driver = new Builder()
            .forBrowser('chrome')
            .setChromeOptions(options)
            .build();

        this.driver
            .manage()
            .window()
            .setSize(1920, 1080)
    }

    get(): ThenableWebDriver {
        return this.driver
    }

}
