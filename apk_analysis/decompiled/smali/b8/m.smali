.class public final Lb8/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb8/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lb8/m;->a:I

    iput-object p1, p0, Lb8/m;->b:Ljava/lang/Object;

    iput-object p3, p0, Lb8/m;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>([Lb8/e;LO7/r;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lb8/m;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lb8/m;->b:Ljava/lang/Object;

    check-cast p2, LG7/j;

    iput-object p2, p0, Lb8/m;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final collect(Lb8/f;LE7/d;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lb8/m;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lb8/q;

    .line 7
    .line 8
    iget-object v1, p0, Lb8/m;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Li7/K;

    .line 11
    .line 12
    const/4 v2, 0x5

    .line 13
    invoke-direct {v0, p1, v2, v1}, Lb8/q;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lb8/m;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, Lb8/m;

    .line 19
    .line 20
    invoke-virtual {p1, v0, p2}, Lb8/m;->collect(Lb8/f;LE7/d;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    sget-object p2, LF7/a;->a:LF7/a;

    .line 25
    .line 26
    if-ne p1, p2, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    sget-object p1, LA7/n;->a:LA7/n;

    .line 30
    .line 31
    :goto_0
    return-object p1

    .line 32
    :pswitch_0
    new-instance v0, Lb8/C;

    .line 33
    .line 34
    iget-object v1, p0, Lb8/m;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, LG7/j;

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    invoke-direct {v0, v2, v1}, Lb8/C;-><init>(LE7/d;LO7/r;)V

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Lb8/m;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, [Lb8/e;

    .line 45
    .line 46
    invoke-static {p2, v0, p1, v1}, Lc8/c;->a(LE7/d;LO7/q;Lb8/f;[Lb8/e;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    sget-object p2, LF7/a;->a:LF7/a;

    .line 51
    .line 52
    if-ne p1, p2, :cond_1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    sget-object p1, LA7/n;->a:LA7/n;

    .line 56
    .line 57
    :goto_1
    return-object p1

    .line 58
    :pswitch_1
    new-instance v0, Lb8/q;

    .line 59
    .line 60
    iget-object v1, p0, Lb8/m;->c:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v1, Lco/notix/le;

    .line 63
    .line 64
    const/4 v2, 0x4

    .line 65
    invoke-direct {v0, p1, v2, v1}, Lb8/q;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lb8/m;->b:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p1, Lb8/e;

    .line 71
    .line 72
    invoke-interface {p1, v0, p2}, Lb8/e;->collect(Lb8/f;LE7/d;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    sget-object p2, LF7/a;->a:LF7/a;

    .line 77
    .line 78
    if-ne p1, p2, :cond_2

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_2
    sget-object p1, LA7/n;->a:LA7/n;

    .line 82
    .line 83
    :goto_2
    return-object p1

    .line 84
    :pswitch_2
    instance-of v0, p2, Lb8/n;

    .line 85
    .line 86
    if-eqz v0, :cond_3

    .line 87
    .line 88
    move-object v0, p2

    .line 89
    check-cast v0, Lb8/n;

    .line 90
    .line 91
    iget v1, v0, Lb8/n;->s:I

    .line 92
    .line 93
    const/high16 v2, -0x80000000

    .line 94
    .line 95
    and-int v3, v1, v2

    .line 96
    .line 97
    if-eqz v3, :cond_3

    .line 98
    .line 99
    sub-int/2addr v1, v2

    .line 100
    iput v1, v0, Lb8/n;->s:I

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_3
    new-instance v0, Lb8/n;

    .line 104
    .line 105
    invoke-direct {v0, p0, p2}, Lb8/n;-><init>(Lb8/m;LE7/d;)V

    .line 106
    .line 107
    .line 108
    :goto_3
    iget-object p2, v0, Lb8/n;->r:Ljava/lang/Object;

    .line 109
    .line 110
    sget-object v1, LF7/a;->a:LF7/a;

    .line 111
    .line 112
    iget v2, v0, Lb8/n;->s:I

    .line 113
    .line 114
    const/4 v3, 0x2

    .line 115
    const/4 v4, 0x1

    .line 116
    if-eqz v2, :cond_6

    .line 117
    .line 118
    if-eq v2, v4, :cond_5

    .line 119
    .line 120
    if-ne v2, v3, :cond_4

    .line 121
    .line 122
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    goto :goto_5

    .line 126
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 127
    .line 128
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 129
    .line 130
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw p1

    .line 134
    :cond_5
    iget-object p1, v0, Lb8/n;->v:Lb8/f;

    .line 135
    .line 136
    iget-object v2, v0, Lb8/n;->u:Lb8/m;

    .line 137
    .line 138
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_6
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    iput-object p0, v0, Lb8/n;->u:Lb8/m;

    .line 146
    .line 147
    iput-object p1, v0, Lb8/n;->v:Lb8/f;

    .line 148
    .line 149
    iput v4, v0, Lb8/n;->s:I

    .line 150
    .line 151
    iget-object p2, p0, Lb8/m;->b:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast p2, Lb8/e;

    .line 154
    .line 155
    invoke-static {p2, p1, v0}, Lb8/M;->g(Lb8/e;Lb8/f;LG7/c;)Ljava/io/Serializable;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    if-ne p2, v1, :cond_7

    .line 160
    .line 161
    goto :goto_6

    .line 162
    :cond_7
    move-object v2, p0

    .line 163
    :goto_4
    check-cast p2, Ljava/lang/Throwable;

    .line 164
    .line 165
    if-eqz p2, :cond_8

    .line 166
    .line 167
    iget-object v2, v2, Lb8/m;->c:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v2, Li7/G;

    .line 170
    .line 171
    const/4 v4, 0x0

    .line 172
    iput-object v4, v0, Lb8/n;->u:Lb8/m;

    .line 173
    .line 174
    iput-object v4, v0, Lb8/n;->v:Lb8/f;

    .line 175
    .line 176
    iput v3, v0, Lb8/n;->s:I

    .line 177
    .line 178
    invoke-virtual {v2, p1, p2, v0}, Li7/G;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    if-ne p1, v1, :cond_8

    .line 183
    .line 184
    goto :goto_6

    .line 185
    :cond_8
    :goto_5
    sget-object v1, LA7/n;->a:LA7/n;

    .line 186
    .line 187
    :goto_6
    return-object v1

    .line 188
    :pswitch_3
    instance-of v0, p2, Lb8/l;

    .line 189
    .line 190
    if-eqz v0, :cond_9

    .line 191
    .line 192
    move-object v0, p2

    .line 193
    check-cast v0, Lb8/l;

    .line 194
    .line 195
    iget v1, v0, Lb8/l;->s:I

    .line 196
    .line 197
    const/high16 v2, -0x80000000

    .line 198
    .line 199
    and-int v3, v1, v2

    .line 200
    .line 201
    if-eqz v3, :cond_9

    .line 202
    .line 203
    sub-int/2addr v1, v2

    .line 204
    iput v1, v0, Lb8/l;->s:I

    .line 205
    .line 206
    goto :goto_7

    .line 207
    :cond_9
    new-instance v0, Lb8/l;

    .line 208
    .line 209
    invoke-direct {v0, p0, p2}, Lb8/l;-><init>(Lb8/m;LE7/d;)V

    .line 210
    .line 211
    .line 212
    :goto_7
    iget-object p2, v0, Lb8/l;->r:Ljava/lang/Object;

    .line 213
    .line 214
    sget-object v1, LF7/a;->a:LF7/a;

    .line 215
    .line 216
    iget v2, v0, Lb8/l;->s:I

    .line 217
    .line 218
    const/4 v3, 0x2

    .line 219
    const/4 v4, 0x1

    .line 220
    if-eqz v2, :cond_c

    .line 221
    .line 222
    if-eq v2, v4, :cond_b

    .line 223
    .line 224
    if-ne v2, v3, :cond_a

    .line 225
    .line 226
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    sget-object v1, LA7/n;->a:LA7/n;

    .line 230
    .line 231
    goto :goto_9

    .line 232
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 233
    .line 234
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 235
    .line 236
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    throw p1

    .line 240
    :cond_b
    iget-object p1, v0, Lb8/l;->w:Lc8/z;

    .line 241
    .line 242
    iget-object v2, v0, Lb8/l;->v:Lb8/f;

    .line 243
    .line 244
    iget-object v4, v0, Lb8/l;->u:Lb8/m;

    .line 245
    .line 246
    :try_start_0
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 247
    .line 248
    .line 249
    goto :goto_8

    .line 250
    :catchall_0
    move-exception p2

    .line 251
    goto :goto_a

    .line 252
    :cond_c
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    new-instance p2, Lc8/z;

    .line 256
    .line 257
    invoke-interface {v0}, LE7/d;->getContext()LE7/i;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    invoke-direct {p2, p1, v2}, Lc8/z;-><init>(Lb8/f;LE7/i;)V

    .line 262
    .line 263
    .line 264
    :try_start_1
    iget-object v2, p0, Lb8/m;->b:Ljava/lang/Object;

    .line 265
    .line 266
    check-cast v2, LX/n;

    .line 267
    .line 268
    iput-object p0, v0, Lb8/l;->u:Lb8/m;

    .line 269
    .line 270
    iput-object p1, v0, Lb8/l;->v:Lb8/f;

    .line 271
    .line 272
    iput-object p2, v0, Lb8/l;->w:Lc8/z;

    .line 273
    .line 274
    iput v4, v0, Lb8/l;->s:I

    .line 275
    .line 276
    invoke-virtual {v2, p2, v0}, LX/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 280
    if-ne v2, v1, :cond_d

    .line 281
    .line 282
    goto :goto_9

    .line 283
    :cond_d
    move-object v4, p0

    .line 284
    move-object v2, p1

    .line 285
    move-object p1, p2

    .line 286
    :goto_8
    invoke-virtual {p1}, LG7/c;->releaseIntercepted()V

    .line 287
    .line 288
    .line 289
    iget-object p1, v4, Lb8/m;->c:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast p1, Lb8/Q;

    .line 292
    .line 293
    const/4 p2, 0x0

    .line 294
    iput-object p2, v0, Lb8/l;->u:Lb8/m;

    .line 295
    .line 296
    iput-object p2, v0, Lb8/l;->v:Lb8/f;

    .line 297
    .line 298
    iput-object p2, v0, Lb8/l;->w:Lc8/z;

    .line 299
    .line 300
    iput v3, v0, Lb8/l;->s:I

    .line 301
    .line 302
    invoke-virtual {p1, v2, v0}, Lb8/Q;->collect(Lb8/f;LE7/d;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    :goto_9
    return-object v1

    .line 306
    :catchall_1
    move-exception p1

    .line 307
    move-object v5, p2

    .line 308
    move-object p2, p1

    .line 309
    move-object p1, v5

    .line 310
    :goto_a
    invoke-virtual {p1}, LG7/c;->releaseIntercepted()V

    .line 311
    .line 312
    .line 313
    throw p2

    .line 314
    nop

    .line 315
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
.end method
