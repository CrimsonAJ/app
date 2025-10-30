.class public final LA0/b;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements LO7/l;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, LA0/b;->d:I

    iput-object p1, p0, LA0/b;->e:Ljava/lang/Object;

    iput-object p3, p0, LA0/b;->f:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/i;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    iget v3, p0, LA0/b;->d:I

    .line 5
    .line 6
    packed-switch v3, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Lu0/m;

    .line 10
    .line 11
    const-string v3, "backStackEntry"

    .line 12
    .line 13
    invoke-static {p1, v3}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v3, p1, Lu0/m;->b:Lu0/C;

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v0, v2

    .line 22
    :goto_0
    if-eqz v0, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move-object v3, v1

    .line 26
    :goto_1
    if-nez v3, :cond_2

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_2
    invoke-virtual {p1}, Lu0/m;->a()Landroid/os/Bundle;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v2, p0, LA0/b;->f:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, Lu0/J;

    .line 36
    .line 37
    iget-object v4, p0, LA0/b;->e:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v4, Lu0/V;

    .line 40
    .line 41
    invoke-virtual {v4, v3, v0, v2}, Lu0/V;->c(Lu0/C;Landroid/os/Bundle;Lu0/J;)Lu0/C;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-nez v0, :cond_3

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_3
    invoke-virtual {v0, v3}, Lu0/C;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_4

    .line 53
    .line 54
    move-object v1, p1

    .line 55
    goto :goto_2

    .line 56
    :cond_4
    invoke-virtual {v4}, Lu0/V;->b()Lu0/o;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {p1}, Lu0/m;->a()Landroid/os/Bundle;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {v0, p1}, Lu0/C;->b(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iget-object v1, v1, Lu0/o;->h:Lu0/H;

    .line 69
    .line 70
    iget-object v2, v1, Lu0/H;->a:Landroid/content/Context;

    .line 71
    .line 72
    invoke-virtual {v1}, Lu0/H;->h()Landroidx/lifecycle/p;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    iget-object v1, v1, Lu0/H;->o:Lu0/u;

    .line 77
    .line 78
    invoke-static {v2, v0, p1, v3, v1}, Ld0/o;->e(Landroid/content/Context;Lu0/C;Landroid/os/Bundle;Landroidx/lifecycle/p;Lu0/u;)Lu0/m;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    :goto_2
    return-object v1

    .line 83
    :pswitch_0
    check-cast p1, Lu0/K;

    .line 84
    .line 85
    const-string v3, "$this$navOptions"

    .line 86
    .line 87
    invoke-static {p1, v3}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    iget-object v3, p1, Lu0/K;->a:LF0/Y;

    .line 91
    .line 92
    iput v2, v3, LF0/Y;->a:I

    .line 93
    .line 94
    iput v2, v3, LF0/Y;->b:I

    .line 95
    .line 96
    iget-object v2, p0, LA0/b;->e:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v2, Lu0/C;

    .line 99
    .line 100
    instance-of v3, v2, Lu0/F;

    .line 101
    .line 102
    if-eqz v3, :cond_8

    .line 103
    .line 104
    sget v3, Lu0/C;->j:I

    .line 105
    .line 106
    sget-object v3, Lu0/c;->j:Lu0/c;

    .line 107
    .line 108
    invoke-static {v2, v3}, LV7/l;->g0(Ljava/lang/Object;LO7/l;)LV7/j;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-interface {v2}, LV7/j;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    iget-object v4, p0, LA0/b;->f:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v4, Lu0/H;

    .line 123
    .line 124
    if-eqz v3, :cond_7

    .line 125
    .line 126
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    check-cast v3, Lu0/C;

    .line 131
    .line 132
    invoke-virtual {v4}, Lu0/H;->f()Lu0/C;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    if-eqz v4, :cond_6

    .line 137
    .line 138
    iget-object v4, v4, Lu0/C;->b:Lu0/F;

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_6
    move-object v4, v1

    .line 142
    :goto_3
    invoke-static {v3, v4}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    if-eqz v3, :cond_5

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_7
    sget v1, Lu0/F;->n:I

    .line 150
    .line 151
    invoke-virtual {v4}, Lu0/H;->g()Lu0/F;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-static {v1}, Ll6/b;->d(Lu0/F;)Lu0/C;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    iget v1, v1, Lu0/C;->h:I

    .line 160
    .line 161
    iput v1, p1, Lu0/K;->d:I

    .line 162
    .line 163
    iput-boolean v0, p1, Lu0/K;->e:Z

    .line 164
    .line 165
    :cond_8
    :goto_4
    sget-object p1, LA7/n;->a:LA7/n;

    .line 166
    .line 167
    return-object p1

    .line 168
    :pswitch_1
    check-cast p1, Ljava/io/IOException;

    .line 169
    .line 170
    const-string v0, "it"

    .line 171
    .line 172
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    iget-object p1, p0, LA0/b;->e:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast p1, Ll8/g;

    .line 178
    .line 179
    iget-object v0, p0, LA0/b;->f:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v0, LA6/t;

    .line 182
    .line 183
    monitor-enter p1

    .line 184
    :try_start_0
    invoke-virtual {v0}, LA6/t;->f()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 185
    .line 186
    .line 187
    monitor-exit p1

    .line 188
    sget-object p1, LA7/n;->a:LA7/n;

    .line 189
    .line 190
    return-object p1

    .line 191
    :catchall_0
    move-exception v0

    .line 192
    monitor-exit p1

    .line 193
    throw v0

    .line 194
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 195
    .line 196
    iget-object p1, p0, LA0/b;->e:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast p1, LZ7/d;

    .line 199
    .line 200
    iget-object p1, p1, LZ7/d;->b:Landroid/os/Handler;

    .line 201
    .line 202
    iget-object v0, p0, LA0/b;->f:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v0, LS5/o;

    .line 205
    .line 206
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 207
    .line 208
    .line 209
    sget-object p1, LA7/n;->a:LA7/n;

    .line 210
    .line 211
    return-object p1

    .line 212
    :pswitch_3
    move-object v3, p1

    .line 213
    check-cast v3, Ljava/lang/Throwable;

    .line 214
    .line 215
    iget-object p1, p0, LA0/b;->e:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast p1, LC0/b;

    .line 218
    .line 219
    invoke-virtual {p1, v3}, LC0/b;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    iget-object p1, p0, LA0/b;->f:Ljava/lang/Object;

    .line 223
    .line 224
    move-object v4, p1

    .line 225
    check-cast v4, Ll1/g;

    .line 226
    .line 227
    iget-object p1, v4, Ll1/g;->c:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast p1, La8/e;

    .line 230
    .line 231
    invoke-virtual {p1, v3, v2}, La8/e;->g(Ljava/lang/Throwable;Z)Z

    .line 232
    .line 233
    .line 234
    :cond_9
    iget-object p1, v4, Ll1/g;->c:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast p1, La8/e;

    .line 237
    .line 238
    invoke-virtual {p1}, La8/e;->h()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    instance-of v0, p1, La8/k;

    .line 243
    .line 244
    if-nez v0, :cond_a

    .line 245
    .line 246
    goto :goto_5

    .line 247
    :cond_a
    move-object p1, v1

    .line 248
    :goto_5
    sget-object v0, LA7/n;->a:LA7/n;

    .line 249
    .line 250
    if-eqz p1, :cond_c

    .line 251
    .line 252
    check-cast p1, LX/Q;

    .line 253
    .line 254
    if-nez v3, :cond_b

    .line 255
    .line 256
    new-instance v5, Ljava/util/concurrent/CancellationException;

    .line 257
    .line 258
    const-string v6, "DataStore scope was cancelled before updateData could complete"

    .line 259
    .line 260
    invoke-direct {v5, v6}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    goto :goto_6

    .line 264
    :cond_b
    move-object v5, v3

    .line 265
    :goto_6
    iget-object p1, p1, LX/Q;->b:LY7/n;

    .line 266
    .line 267
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    new-instance v6, LY7/q;

    .line 271
    .line 272
    invoke-direct {v6, v5, v2}, LY7/q;-><init>(Ljava/lang/Throwable;Z)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {p1, v6}, LY7/r0;->L(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-object p1, v0

    .line 279
    goto :goto_7

    .line 280
    :cond_c
    move-object p1, v1

    .line 281
    :goto_7
    if-nez p1, :cond_9

    .line 282
    .line 283
    return-object v0

    .line 284
    :pswitch_4
    check-cast p1, Ljava/lang/Throwable;

    .line 285
    .line 286
    iget-object v2, p0, LA0/b;->e:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast v2, Lu/h;

    .line 289
    .line 290
    if-eqz p1, :cond_e

    .line 291
    .line 292
    instance-of v3, p1, Ljava/util/concurrent/CancellationException;

    .line 293
    .line 294
    if-eqz v3, :cond_d

    .line 295
    .line 296
    iput-boolean v0, v2, Lu/h;->d:Z

    .line 297
    .line 298
    iget-object p1, v2, Lu/h;->b:Lu/j;

    .line 299
    .line 300
    if-eqz p1, :cond_f

    .line 301
    .line 302
    iget-object p1, p1, Lu/j;->b:Lu/i;

    .line 303
    .line 304
    invoke-virtual {p1, v0}, Lu/g;->cancel(Z)Z

    .line 305
    .line 306
    .line 307
    move-result p1

    .line 308
    if-eqz p1, :cond_f

    .line 309
    .line 310
    iput-object v1, v2, Lu/h;->a:Ljava/lang/Object;

    .line 311
    .line 312
    iput-object v1, v2, Lu/h;->b:Lu/j;

    .line 313
    .line 314
    iput-object v1, v2, Lu/h;->c:Lu/k;

    .line 315
    .line 316
    goto :goto_8

    .line 317
    :cond_d
    iput-boolean v0, v2, Lu/h;->d:Z

    .line 318
    .line 319
    iget-object v0, v2, Lu/h;->b:Lu/j;

    .line 320
    .line 321
    if-eqz v0, :cond_f

    .line 322
    .line 323
    iget-object v0, v0, Lu/j;->b:Lu/i;

    .line 324
    .line 325
    invoke-virtual {v0, p1}, Lu/g;->k(Ljava/lang/Throwable;)Z

    .line 326
    .line 327
    .line 328
    move-result p1

    .line 329
    if-eqz p1, :cond_f

    .line 330
    .line 331
    iput-object v1, v2, Lu/h;->a:Ljava/lang/Object;

    .line 332
    .line 333
    iput-object v1, v2, Lu/h;->b:Lu/j;

    .line 334
    .line 335
    iput-object v1, v2, Lu/h;->c:Lu/k;

    .line 336
    .line 337
    goto :goto_8

    .line 338
    :cond_e
    iget-object p1, p0, LA0/b;->f:Ljava/lang/Object;

    .line 339
    .line 340
    check-cast p1, LY7/F;

    .line 341
    .line 342
    invoke-virtual {p1}, LY7/r0;->y()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object p1

    .line 346
    iput-boolean v0, v2, Lu/h;->d:Z

    .line 347
    .line 348
    iget-object v0, v2, Lu/h;->b:Lu/j;

    .line 349
    .line 350
    if-eqz v0, :cond_f

    .line 351
    .line 352
    iget-object v0, v0, Lu/j;->b:Lu/i;

    .line 353
    .line 354
    invoke-virtual {v0, p1}, Lu/g;->j(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    move-result p1

    .line 358
    if-eqz p1, :cond_f

    .line 359
    .line 360
    iput-object v1, v2, Lu/h;->a:Ljava/lang/Object;

    .line 361
    .line 362
    iput-object v1, v2, Lu/h;->b:Lu/j;

    .line 363
    .line 364
    iput-object v1, v2, Lu/h;->c:Lu/k;

    .line 365
    .line 366
    :cond_f
    :goto_8
    sget-object p1, LA7/n;->a:LA7/n;

    .line 367
    .line 368
    return-object p1

    .line 369
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
.end method
