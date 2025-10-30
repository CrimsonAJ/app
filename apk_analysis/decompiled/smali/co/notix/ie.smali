.class public final Lco/notix/ie;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/notix/ee;


# instance fields
.field public final a:Lco/notix/xq;

.field public final b:Lco/notix/y8;

.field public final c:Lco/notix/lf;

.field public final d:Lco/notix/de;

.field public final e:Lco/notix/og;

.field public final f:Lco/notix/ic;


# direct methods
.method public constructor <init>(Lco/notix/xq;Lco/notix/d9;Lco/notix/lf;Lco/notix/de;Lco/notix/og;Lco/notix/ic;)V
    .locals 1

    const-string v0, "storage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contextProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationsPermissionController"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricsDataSource"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notixCallbackReporter"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/notix/ie;->a:Lco/notix/xq;

    iput-object p2, p0, Lco/notix/ie;->b:Lco/notix/y8;

    iput-object p3, p0, Lco/notix/ie;->c:Lco/notix/lf;

    iput-object p4, p0, Lco/notix/ie;->d:Lco/notix/de;

    iput-object p5, p0, Lco/notix/ie;->e:Lco/notix/og;

    iput-object p6, p0, Lco/notix/ie;->f:Lco/notix/ic;

    return-void
.end method


# virtual methods
.method public final a(LE7/d;)Ljava/lang/Object;
    .locals 12

    .line 1
    const-class v0, Lco/notix/vd;

    .line 2
    .line 3
    const-string v1, "ToJsonAdapter for class "

    .line 4
    .line 5
    instance-of v2, p1, Lco/notix/fe;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, p1

    .line 10
    check-cast v2, Lco/notix/fe;

    .line 11
    .line 12
    iget v3, v2, Lco/notix/fe;->d:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lco/notix/fe;->d:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lco/notix/fe;

    .line 25
    .line 26
    invoke-direct {v2, p0, p1}, Lco/notix/fe;-><init>(Lco/notix/ie;LE7/d;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p1, v2, Lco/notix/fe;->b:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, LF7/a;->a:LF7/a;

    .line 32
    .line 33
    iget v4, v2, Lco/notix/fe;->d:I

    .line 34
    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v4, :cond_2

    .line 37
    .line 38
    if-ne v4, v5, :cond_1

    .line 39
    .line 40
    iget-object v1, v2, Lco/notix/fe;->a:Lco/notix/ie;

    .line 41
    .line 42
    :try_start_0
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    move-object p1, v0

    .line 48
    goto/16 :goto_2

    .line 49
    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p1

    .line 58
    :cond_2
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :try_start_1
    new-instance v6, Lco/notix/vd;

    .line 62
    .line 63
    iget-object p1, p0, Lco/notix/ie;->a:Lco/notix/xq;

    .line 64
    .line 65
    invoke-virtual {p1}, Lco/notix/xq;->b()J

    .line 66
    .line 67
    .line 68
    move-result-wide v7

    .line 69
    iget-object p1, p0, Lco/notix/ie;->a:Lco/notix/xq;

    .line 70
    .line 71
    invoke-virtual {p1}, Lco/notix/xq;->c()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    iget-object p1, p0, Lco/notix/ie;->b:Lco/notix/y8;

    .line 76
    .line 77
    check-cast p1, Lco/notix/d9;

    .line 78
    .line 79
    invoke-virtual {p1}, Lco/notix/d9;->a()Landroid/content/Context;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v10

    .line 87
    const-string p1, "contextProvider.appContext.packageName"

    .line 88
    .line 89
    invoke-static {v10, p1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p0, Lco/notix/ie;->a:Lco/notix/xq;

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-static {}, Lco/notix/xq;->a()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v11

    .line 101
    invoke-direct/range {v6 .. v11}, Lco/notix/vd;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    iget-object p1, p0, Lco/notix/ie;->f:Lco/notix/ic;

    .line 105
    .line 106
    iget-object p1, p1, Lco/notix/ic;->a:Ljava/util/LinkedHashMap;

    .line 107
    .line 108
    invoke-virtual {p1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    check-cast p1, Lco/notix/gr;

    .line 113
    .line 114
    if-eqz p1, :cond_4

    .line 115
    .line 116
    invoke-interface {p1, v6}, Lco/notix/td;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    iget-object v0, p0, Lco/notix/ie;->d:Lco/notix/de;

    .line 125
    .line 126
    iput-object p0, v2, Lco/notix/fe;->a:Lco/notix/ie;

    .line 127
    .line 128
    iput v5, v2, Lco/notix/fe;->d:I

    .line 129
    .line 130
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    sget-object v1, LY7/K;->b:Lf8/d;

    .line 134
    .line 135
    new-instance v4, Lco/notix/ce;

    .line 136
    .line 137
    const/4 v5, 0x0

    .line 138
    invoke-direct {v4, v0, p1, v5}, Lco/notix/ce;-><init>(Lco/notix/de;Ljava/lang/String;LE7/d;)V

    .line 139
    .line 140
    .line 141
    invoke-static {v1, v4, v2}, LY7/B;->C(LE7/i;LO7/p;LE7/d;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 145
    if-ne p1, v3, :cond_3

    .line 146
    .line 147
    return-object v3

    .line 148
    :cond_3
    move-object v1, p0

    .line 149
    :goto_1
    :try_start_2
    check-cast p1, Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :catchall_1
    move-exception v0

    .line 153
    move-object p1, v0

    .line 154
    move-object v1, p0

    .line 155
    goto :goto_2

    .line 156
    :cond_4
    :try_start_3
    new-instance p1, Ljava/lang/NullPointerException;

    .line 157
    .line 158
    new-instance v2, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    const-string v0, " not found"

    .line 167
    .line 168
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 179
    :goto_2
    invoke-static {p1}, La/a;->h(Ljava/lang/Throwable;)LA7/i;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    :goto_3
    invoke-static {p1}, LA7/j;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    if-nez v0, :cond_5

    .line 188
    .line 189
    check-cast p1, Ljava/lang/String;

    .line 190
    .line 191
    sget-object v0, Lco/notix/md;->a:Lco/notix/kd;

    .line 192
    .line 193
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    iget-object v0, v0, Lco/notix/kd;->b:Lco/notix/x8;

    .line 197
    .line 198
    const-string v2, "app_install tracked"

    .line 199
    .line 200
    invoke-virtual {v0, v2}, Lco/notix/x8;->a(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    iget-object v0, v1, Lco/notix/ie;->e:Lco/notix/og;

    .line 204
    .line 205
    new-instance v1, Lco/notix/callback/NotixCallback$AppInstall;

    .line 206
    .line 207
    sget-object v2, Lco/notix/callback/NotixCallbackStatus;->SUCCESS:Lco/notix/callback/NotixCallbackStatus;

    .line 208
    .line 209
    invoke-direct {v1, v2, p1}, Lco/notix/callback/NotixCallback$AppInstall;-><init>(Lco/notix/callback/NotixCallbackStatus;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, v1}, Lco/notix/og;->a(Lco/notix/callback/NotixCallback;)V

    .line 213
    .line 214
    .line 215
    goto :goto_4

    .line 216
    :cond_5
    sget-object p1, Lco/notix/md;->a:Lco/notix/kd;

    .line 217
    .line 218
    const-string v2, "couldn\'t send app_install event"

    .line 219
    .line 220
    invoke-static {p1, v2, v0}, Lco/notix/yn;->a(Lco/notix/kd;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 221
    .line 222
    .line 223
    iget-object p1, v1, Lco/notix/ie;->e:Lco/notix/og;

    .line 224
    .line 225
    new-instance v1, Lco/notix/callback/NotixCallback$AppInstall;

    .line 226
    .line 227
    sget-object v2, Lco/notix/callback/NotixCallbackStatus;->FAILURE:Lco/notix/callback/NotixCallbackStatus;

    .line 228
    .line 229
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-direct {v1, v2, v0}, Lco/notix/callback/NotixCallback$AppInstall;-><init>(Lco/notix/callback/NotixCallbackStatus;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {p1, v1}, Lco/notix/og;->a(Lco/notix/callback/NotixCallback;)V

    .line 237
    .line 238
    .line 239
    :goto_4
    sget-object p1, LA7/n;->a:LA7/n;

    .line 240
    .line 241
    return-object p1
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
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

.method public final b(LE7/d;)Ljava/lang/Object;
    .locals 12

    .line 1
    const-class v0, Lco/notix/xd;

    .line 2
    .line 3
    const-string v1, "ToJsonAdapter for class "

    .line 4
    .line 5
    instance-of v2, p1, Lco/notix/ge;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, p1

    .line 10
    check-cast v2, Lco/notix/ge;

    .line 11
    .line 12
    iget v3, v2, Lco/notix/ge;->c:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lco/notix/ge;->c:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lco/notix/ge;

    .line 25
    .line 26
    invoke-direct {v2, p0, p1}, Lco/notix/ge;-><init>(Lco/notix/ie;LE7/d;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p1, v2, Lco/notix/ge;->a:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, LF7/a;->a:LF7/a;

    .line 32
    .line 33
    iget v4, v2, Lco/notix/ge;->c:I

    .line 34
    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v4, :cond_2

    .line 37
    .line 38
    if-ne v4, v5, :cond_1

    .line 39
    .line 40
    :try_start_0
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    move-object p1, v0

    .line 46
    goto/16 :goto_2

    .line 47
    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_2
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :try_start_1
    new-instance v6, Lco/notix/xd;

    .line 60
    .line 61
    iget-object p1, p0, Lco/notix/ie;->a:Lco/notix/xq;

    .line 62
    .line 63
    invoke-virtual {p1}, Lco/notix/xq;->b()J

    .line 64
    .line 65
    .line 66
    move-result-wide v7

    .line 67
    iget-object p1, p0, Lco/notix/ie;->a:Lco/notix/xq;

    .line 68
    .line 69
    invoke-virtual {p1}, Lco/notix/xq;->c()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    iget-object p1, p0, Lco/notix/ie;->b:Lco/notix/y8;

    .line 74
    .line 75
    check-cast p1, Lco/notix/d9;

    .line 76
    .line 77
    invoke-virtual {p1}, Lco/notix/d9;->a()Landroid/content/Context;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v10

    .line 85
    const-string p1, "contextProvider.appContext.packageName"

    .line 86
    .line 87
    invoke-static {v10, p1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    iget-object p1, p0, Lco/notix/ie;->a:Lco/notix/xq;

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-static {}, Lco/notix/xq;->a()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v11

    .line 99
    invoke-direct/range {v6 .. v11}, Lco/notix/xd;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    iget-object p1, p0, Lco/notix/ie;->f:Lco/notix/ic;

    .line 103
    .line 104
    iget-object p1, p1, Lco/notix/ic;->a:Ljava/util/LinkedHashMap;

    .line 105
    .line 106
    invoke-virtual {p1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    check-cast p1, Lco/notix/gr;

    .line 111
    .line 112
    if-eqz p1, :cond_4

    .line 113
    .line 114
    invoke-interface {p1, v6}, Lco/notix/td;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    iget-object v0, p0, Lco/notix/ie;->d:Lco/notix/de;

    .line 123
    .line 124
    iput v5, v2, Lco/notix/ge;->c:I

    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    sget-object v1, LY7/K;->b:Lf8/d;

    .line 130
    .line 131
    new-instance v4, Lco/notix/ce;

    .line 132
    .line 133
    const/4 v5, 0x0

    .line 134
    invoke-direct {v4, v0, p1, v5}, Lco/notix/ce;-><init>(Lco/notix/de;Ljava/lang/String;LE7/d;)V

    .line 135
    .line 136
    .line 137
    invoke-static {v1, v4, v2}, LY7/B;->C(LE7/i;LO7/p;LE7/d;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    if-ne p1, v3, :cond_3

    .line 142
    .line 143
    return-object v3

    .line 144
    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/String;

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    .line 148
    .line 149
    new-instance v2, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    const-string v0, " not found"

    .line 158
    .line 159
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 170
    :goto_2
    invoke-static {p1}, La/a;->h(Ljava/lang/Throwable;)LA7/i;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    :goto_3
    invoke-static {p1}, LA7/j;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    if-nez v0, :cond_5

    .line 179
    .line 180
    check-cast p1, Ljava/lang/String;

    .line 181
    .line 182
    sget-object p1, Lco/notix/md;->a:Lco/notix/kd;

    .line 183
    .line 184
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    iget-object p1, p1, Lco/notix/kd;->b:Lco/notix/x8;

    .line 188
    .line 189
    const-string v0, "app_update tracked"

    .line 190
    .line 191
    invoke-virtual {p1, v0}, Lco/notix/x8;->a(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    goto :goto_4

    .line 195
    :cond_5
    sget-object p1, Lco/notix/md;->a:Lco/notix/kd;

    .line 196
    .line 197
    const-string v1, "couldn\'t send app_update event"

    .line 198
    .line 199
    invoke-static {p1, v1, v0}, Lco/notix/yn;->a(Lco/notix/kd;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 200
    .line 201
    .line 202
    :goto_4
    sget-object p1, LA7/n;->a:LA7/n;

    .line 203
    .line 204
    return-object p1
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
.end method

.method public final c(LE7/d;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const-class v2, Lco/notix/zd;

    .line 6
    .line 7
    const-string v3, "NOTIX_PREF_STORAGE"

    .line 8
    .line 9
    const-string v4, "context.packageName"

    .line 10
    .line 11
    const-string v5, "ToJsonAdapter for class "

    .line 12
    .line 13
    instance-of v6, v0, Lco/notix/he;

    .line 14
    .line 15
    if-eqz v6, :cond_0

    .line 16
    .line 17
    move-object v6, v0

    .line 18
    check-cast v6, Lco/notix/he;

    .line 19
    .line 20
    iget v7, v6, Lco/notix/he;->d:I

    .line 21
    .line 22
    const/high16 v8, -0x80000000

    .line 23
    .line 24
    and-int v9, v7, v8

    .line 25
    .line 26
    if-eqz v9, :cond_0

    .line 27
    .line 28
    sub-int/2addr v7, v8

    .line 29
    iput v7, v6, Lco/notix/he;->d:I

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance v6, Lco/notix/he;

    .line 33
    .line 34
    invoke-direct {v6, v1, v0}, Lco/notix/he;-><init>(Lco/notix/ie;LE7/d;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    iget-object v0, v6, Lco/notix/he;->b:Ljava/lang/Object;

    .line 38
    .line 39
    sget-object v7, LF7/a;->a:LF7/a;

    .line 40
    .line 41
    iget v8, v6, Lco/notix/he;->d:I

    .line 42
    .line 43
    const/4 v9, 0x1

    .line 44
    if-eqz v8, :cond_2

    .line 45
    .line 46
    if-ne v8, v9, :cond_1

    .line 47
    .line 48
    iget-object v2, v6, Lco/notix/he;->a:Lco/notix/ie;

    .line 49
    .line 50
    :try_start_0
    invoke-static {v0}, La/a;->A(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    goto/16 :goto_1

    .line 54
    .line 55
    :catchall_0
    move-exception v0

    .line 56
    goto/16 :goto_2

    .line 57
    .line 58
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw v0

    .line 66
    :cond_2
    invoke-static {v0}, La/a;->A(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :try_start_1
    iget-object v0, v1, Lco/notix/ie;->b:Lco/notix/y8;

    .line 70
    .line 71
    check-cast v0, Lco/notix/d9;

    .line 72
    .line 73
    invoke-virtual {v0}, Lco/notix/d9;->a()Landroid/content/Context;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    const-string v10, "context.packageManager"

    .line 82
    .line 83
    invoke-static {v8, v10}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v10

    .line 90
    invoke-static {v10, v4}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-static {v8, v10}, Lco/notix/f7;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;)Landroid/content/pm/PackageInfo;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    iget-object v13, v8, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 98
    .line 99
    new-instance v10, Lco/notix/zd;

    .line 100
    .line 101
    iget-object v8, v1, Lco/notix/ie;->a:Lco/notix/xq;

    .line 102
    .line 103
    invoke-virtual {v8}, Lco/notix/xq;->b()J

    .line 104
    .line 105
    .line 106
    move-result-wide v11

    .line 107
    const-string v8, "appVersion"

    .line 108
    .line 109
    invoke-static {v13, v8}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    iget-object v8, v1, Lco/notix/ie;->a:Lco/notix/xq;

    .line 113
    .line 114
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-static {}, Lco/notix/xq;->a()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v14

    .line 121
    iget-object v8, v1, Lco/notix/ie;->a:Lco/notix/xq;

    .line 122
    .line 123
    invoke-virtual {v8}, Lco/notix/xq;->c()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v15

    .line 127
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v8

    .line 131
    invoke-static {v8, v4}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    sget v17, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 135
    .line 136
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 141
    .line 142
    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 143
    .line 144
    const-string v9, "MODEL"

    .line 145
    .line 146
    invoke-static {v4, v9}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    sget-object v9, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 150
    .line 151
    move/from16 v18, v0

    .line 152
    .line 153
    const-string v0, "MANUFACTURER"

    .line 154
    .line 155
    invoke-static {v9, v0}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    sget-object v0, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    .line 159
    .line 160
    move-object/from16 v19, v4

    .line 161
    .line 162
    const-string v4, "SUPPORTED_ABIS"

    .line 163
    .line 164
    invoke-static {v0, v4}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-static {v0}, LB7/j;->o0([Ljava/lang/Object;)Ljava/util/List;

    .line 168
    .line 169
    .line 170
    move-result-object v21

    .line 171
    iget-object v0, v1, Lco/notix/ie;->a:Lco/notix/xq;

    .line 172
    .line 173
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    sget-object v0, Lco/notix/wq;->b:Lco/notix/d9;

    .line 177
    .line 178
    invoke-virtual {v0}, Lco/notix/d9;->a()Landroid/content/Context;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    move-object/from16 v16, v0

    .line 183
    .line 184
    const-string v0, "NOTIX_FOREGROUND_TIME"

    .line 185
    .line 186
    move-object/from16 v20, v8

    .line 187
    .line 188
    const/4 v8, 0x0

    .line 189
    invoke-virtual {v4, v3, v8}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    move-object/from16 v22, v9

    .line 194
    .line 195
    const-wide/16 v8, 0x0

    .line 196
    .line 197
    invoke-interface {v4, v0, v8, v9}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 198
    .line 199
    .line 200
    move-result-wide v24

    .line 201
    const/16 v0, 0x3e8

    .line 202
    .line 203
    int-to-long v8, v0

    .line 204
    div-long v24, v24, v8

    .line 205
    .line 206
    iget-object v0, v1, Lco/notix/ie;->a:Lco/notix/xq;

    .line 207
    .line 208
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v16 .. v16}, Lco/notix/d9;->a()Landroid/content/Context;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    const-string v4, "NOTIX_PERIODIC_WORKER_RUN_COUNT"

    .line 216
    .line 217
    const/4 v8, 0x0

    .line 218
    invoke-virtual {v0, v3, v8}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    const-wide/16 v8, 0x0

    .line 223
    .line 224
    invoke-interface {v0, v4, v8, v9}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 225
    .line 226
    .line 227
    move-result-wide v3

    .line 228
    iget-object v0, v1, Lco/notix/ie;->c:Lco/notix/lf;

    .line 229
    .line 230
    invoke-virtual {v0}, Lco/notix/lf;->c()Z

    .line 231
    .line 232
    .line 233
    move-result v26

    .line 234
    move-object/from16 v16, v20

    .line 235
    .line 236
    move-object/from16 v20, v22

    .line 237
    .line 238
    move-wide/from16 v22, v24

    .line 239
    .line 240
    move-wide/from16 v24, v3

    .line 241
    .line 242
    invoke-direct/range {v10 .. v26}, Lco/notix/zd;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/util/List;JJZ)V

    .line 243
    .line 244
    .line 245
    iget-object v0, v1, Lco/notix/ie;->f:Lco/notix/ic;

    .line 246
    .line 247
    iget-object v0, v0, Lco/notix/ic;->a:Ljava/util/LinkedHashMap;

    .line 248
    .line 249
    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    check-cast v0, Lco/notix/gr;

    .line 254
    .line 255
    if-eqz v0, :cond_4

    .line 256
    .line 257
    invoke-interface {v0, v10}, Lco/notix/td;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    iget-object v2, v1, Lco/notix/ie;->d:Lco/notix/de;

    .line 266
    .line 267
    iput-object v1, v6, Lco/notix/he;->a:Lco/notix/ie;

    .line 268
    .line 269
    const/4 v3, 0x1

    .line 270
    iput v3, v6, Lco/notix/he;->d:I

    .line 271
    .line 272
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    sget-object v3, LY7/K;->b:Lf8/d;

    .line 276
    .line 277
    new-instance v4, Lco/notix/ce;

    .line 278
    .line 279
    const/4 v5, 0x0

    .line 280
    invoke-direct {v4, v2, v0, v5}, Lco/notix/ce;-><init>(Lco/notix/de;Ljava/lang/String;LE7/d;)V

    .line 281
    .line 282
    .line 283
    invoke-static {v3, v4, v6}, LY7/B;->C(LE7/i;LO7/p;LE7/d;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 287
    if-ne v0, v7, :cond_3

    .line 288
    .line 289
    return-object v7

    .line 290
    :cond_3
    move-object v2, v1

    .line 291
    :goto_1
    :try_start_2
    check-cast v0, Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 292
    .line 293
    goto :goto_3

    .line 294
    :catchall_1
    move-exception v0

    .line 295
    move-object v2, v1

    .line 296
    goto :goto_2

    .line 297
    :cond_4
    :try_start_3
    new-instance v0, Ljava/lang/NullPointerException;

    .line 298
    .line 299
    new-instance v3, Ljava/lang/StringBuilder;

    .line 300
    .line 301
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    const-string v2, " not found"

    .line 308
    .line 309
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 320
    :goto_2
    invoke-static {v0}, La/a;->h(Ljava/lang/Throwable;)LA7/i;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    :goto_3
    invoke-static {v0}, LA7/j;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 325
    .line 326
    .line 327
    move-result-object v3

    .line 328
    if-nez v3, :cond_5

    .line 329
    .line 330
    check-cast v0, Ljava/lang/String;

    .line 331
    .line 332
    sget-object v3, Lco/notix/md;->a:Lco/notix/kd;

    .line 333
    .line 334
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    iget-object v3, v3, Lco/notix/kd;->b:Lco/notix/x8;

    .line 338
    .line 339
    const-string v4, "metric general tracked"

    .line 340
    .line 341
    invoke-virtual {v3, v4}, Lco/notix/x8;->b(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    iget-object v2, v2, Lco/notix/ie;->e:Lco/notix/og;

    .line 345
    .line 346
    new-instance v3, Lco/notix/callback/NotixCallback$GeneralMetrics;

    .line 347
    .line 348
    sget-object v4, Lco/notix/callback/NotixCallbackStatus;->SUCCESS:Lco/notix/callback/NotixCallbackStatus;

    .line 349
    .line 350
    invoke-direct {v3, v4, v0}, Lco/notix/callback/NotixCallback$GeneralMetrics;-><init>(Lco/notix/callback/NotixCallbackStatus;Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v2, v3}, Lco/notix/og;->a(Lco/notix/callback/NotixCallback;)V

    .line 354
    .line 355
    .line 356
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 357
    .line 358
    goto :goto_4

    .line 359
    :cond_5
    sget-object v0, Lco/notix/md;->a:Lco/notix/kd;

    .line 360
    .line 361
    const-string v4, "couldn\'t send metrics"

    .line 362
    .line 363
    invoke-static {v0, v4, v3}, Lco/notix/yn;->a(Lco/notix/kd;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 364
    .line 365
    .line 366
    iget-object v0, v2, Lco/notix/ie;->e:Lco/notix/og;

    .line 367
    .line 368
    new-instance v2, Lco/notix/callback/NotixCallback$GeneralMetrics;

    .line 369
    .line 370
    sget-object v4, Lco/notix/callback/NotixCallbackStatus;->FAILURE:Lco/notix/callback/NotixCallbackStatus;

    .line 371
    .line 372
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v3

    .line 376
    invoke-direct {v2, v4, v3}, Lco/notix/callback/NotixCallback$GeneralMetrics;-><init>(Lco/notix/callback/NotixCallbackStatus;Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v0, v2}, Lco/notix/og;->a(Lco/notix/callback/NotixCallback;)V

    .line 380
    .line 381
    .line 382
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 383
    .line 384
    :goto_4
    return-object v0
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
