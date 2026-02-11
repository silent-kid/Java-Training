import { test, expect } from '@playwright/test';

test('iframedemo', async ({ page }) => {
    await page.goto('https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert');
    page.on('dialog', async dialog => {
    console.log('Popup message:', dialog.message());
    expect(dialog.message()).toContain('Hello');
    await page.waitForTimeout(2000);
    await dialog.accept();
  });

  
//  const iframe = page.frame({ name: 'iframeResult' });
    const iframe = page.frameLocator("#iframeResult");
    await iframe?.locator('button').click();

});

