.class public final synthetic LK5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LK5/a;->a:I

    iput-object p2, p0, LK5/a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 7

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, LK5/a;->b:Ljava/lang/Object;

    .line 6
    .line 7
    iget v4, p0, LK5/a;->a:I

    .line 8
    .line 9
    packed-switch v4, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v3, Lcom/anilab/android/ui/splash/SplashFragment;

    .line 13
    .line 14
    iget-object p1, v3, Lcom/anilab/android/ui/splash/SplashFragment;->D0:LY2/r;

    .line 15
    .line 16
    invoke-virtual {p1}, LY2/r;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Lp2/h;

    .line 21
    .line 22
    new-instance v0, Lp2/g;

    .line 23
    .line 24
    invoke-direct {v0, p1, v1, v2}, Lp2/g;-><init>(Lp2/h;ZLE7/d;)V

    .line 25
    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-virtual {p1, v1, v0}, LM1/r;->d(ZLO7/p;)LY7/y0;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3}, LM1/n;->e0()LW/g;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, LJ1/A0;

    .line 36
    .line 37
    iget-object p1, p1, LJ1/A0;->v:Lcom/google/android/material/button/MaterialButton;

    .line 38
    .line 39
    const-string v0, "buttonRetry"

    .line 40
    .line 41
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const/16 v0, 0x8

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, LM1/n;->e0()LW/g;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, LJ1/A0;

    .line 54
    .line 55
    iget-object p1, p1, LJ1/A0;->w:Landroidx/appcompat/widget/AppCompatImageView;

    .line 56
    .line 57
    const-string v0, "imageLoading"

    .line 58
    .line 59
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3}, Lcom/anilab/android/ui/splash/SplashFragment;->s0()V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_0
    sget-object p1, Lo2/l;->M0:Ljava/lang/String;

    .line 70
    .line 71
    check-cast v3, Lo2/l;

    .line 72
    .line 73
    invoke-virtual {v3}, Li0/v;->k()Li0/y;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-eqz p1, :cond_0

    .line 78
    .line 79
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 80
    .line 81
    .line 82
    :cond_0
    return-void

    .line 83
    :pswitch_1
    check-cast v3, LJ1/u0;

    .line 84
    .line 85
    iget-object p1, v3, LJ1/u0;->D:Landroidx/appcompat/widget/AppCompatEditText;

    .line 86
    .line 87
    invoke-virtual {p1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    if-eqz p1, :cond_2

    .line 92
    .line 93
    invoke-static {p1}, LW7/d;->U(Ljava/lang/CharSequence;)Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-eqz p1, :cond_1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_1
    iget-object p1, v3, LJ1/u0;->D:Landroidx/appcompat/widget/AppCompatEditText;

    .line 101
    .line 102
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 103
    .line 104
    .line 105
    :cond_2
    :goto_0
    return-void

    .line 106
    :pswitch_2
    check-cast v3, Lcom/google/android/material/datepicker/k;

    .line 107
    .line 108
    invoke-virtual {v3}, Lcom/google/android/material/datepicker/k;->l0()V

    .line 109
    .line 110
    .line 111
    throw v2

    .line 112
    :pswitch_3
    check-cast v3, Lco/notix/zb;

    .line 113
    .line 114
    invoke-static {v3, p1}, Lco/notix/zb;->a(Lco/notix/zb;Landroid/view/View;)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :pswitch_4
    check-cast v3, Lco/notix/appopen/AppOpenActivity;

    .line 119
    .line 120
    invoke-static {v3, p1}, Lco/notix/k6;->a(Lco/notix/appopen/AppOpenActivity;Landroid/view/View;)V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :pswitch_5
    check-cast v3, Lc2/l;

    .line 125
    .line 126
    invoke-virtual {v3}, LM1/n;->e0()LW/g;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    check-cast p1, LJ1/a0;

    .line 131
    .line 132
    iget-object p1, p1, LJ1/a0;->B:Lcom/google/android/material/textfield/TextInputEditText;

    .line 133
    .line 134
    invoke-virtual {p1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    if-eqz p1, :cond_3

    .line 139
    .line 140
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    goto :goto_1

    .line 145
    :cond_3
    move-object p1, v2

    .line 146
    :goto_1
    if-nez p1, :cond_4

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_4
    move-object v0, p1

    .line 150
    :goto_2
    invoke-static {v0}, LW7/d;->U(Ljava/lang/CharSequence;)Z

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    if-eqz p1, :cond_5

    .line 155
    .line 156
    new-instance p1, LM1/D;

    .line 157
    .line 158
    const v0, 0x7f14017e

    .line 159
    .line 160
    .line 161
    invoke-direct {p1, v0}, LM1/D;-><init>(I)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v3, p1}, LM1/n;->o0(LM1/E;)V

    .line 165
    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_5
    invoke-virtual {v3}, Lc2/l;->s0()Lc2/r;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    iget-object v3, p1, Lc2/r;->q:LY7/y0;

    .line 173
    .line 174
    if-eqz v3, :cond_6

    .line 175
    .line 176
    invoke-virtual {v3, v2}, LY7/r0;->d(Ljava/util/concurrent/CancellationException;)V

    .line 177
    .line 178
    .line 179
    :cond_6
    new-instance v3, Lc2/q;

    .line 180
    .line 181
    invoke-direct {v3, p1, v0, v2}, Lc2/q;-><init>(Lc2/r;Ljava/lang/String;LE7/d;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p1, v1, v3}, LM1/r;->d(ZLO7/p;)LY7/y0;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    iput-object v0, p1, Lc2/r;->q:LY7/y0;

    .line 189
    .line 190
    :goto_3
    return-void

    .line 191
    :pswitch_6
    check-cast v3, Lc2/i;

    .line 192
    .line 193
    invoke-virtual {v3}, Lc2/a;->m()Landroid/content/Context;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    if-nez p1, :cond_7

    .line 198
    .line 199
    goto :goto_5

    .line 200
    :cond_7
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 201
    .line 202
    const/16 v4, 0x1e

    .line 203
    .line 204
    if-lt v2, v4, :cond_8

    .line 205
    .line 206
    goto :goto_4

    .line 207
    :cond_8
    const-string v2, "android.permission.READ_EXTERNAL_STORAGE"

    .line 208
    .line 209
    invoke-static {p1, v2}, LE/d;->a(Landroid/content/Context;Ljava/lang/String;)I

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    const-string v4, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 214
    .line 215
    invoke-static {p1, v4}, LE/d;->a(Landroid/content/Context;Ljava/lang/String;)I

    .line 216
    .line 217
    .line 218
    move-result p1

    .line 219
    if-nez v2, :cond_9

    .line 220
    .line 221
    if-nez p1, :cond_9

    .line 222
    .line 223
    :goto_4
    invoke-virtual {v3}, Lc2/i;->s0()V

    .line 224
    .line 225
    .line 226
    goto :goto_6

    .line 227
    :cond_9
    :goto_5
    invoke-virtual {v3}, Li0/v;->k()Li0/y;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    if-eqz p1, :cond_a

    .line 232
    .line 233
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    const v4, 0x7f140149

    .line 238
    .line 239
    .line 240
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    new-instance v4, Lc2/d;

    .line 245
    .line 246
    invoke-direct {v4, v3, v1}, Lc2/d;-><init>(Lc2/i;I)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    const v3, 0x7f1400fd

    .line 254
    .line 255
    .line 256
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    new-instance v3, LC2/P;

    .line 261
    .line 262
    const/16 v5, 0xd

    .line 263
    .line 264
    invoke-direct {v3, v5}, LC2/P;-><init>(I)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 268
    .line 269
    .line 270
    move-result-object v5

    .line 271
    const v6, 0x7f1401d8

    .line 272
    .line 273
    .line 274
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v5

    .line 278
    new-instance v6, Lr2/b;

    .line 279
    .line 280
    invoke-direct {v6, p1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 281
    .line 282
    .line 283
    iput-object v0, v6, Lr2/b;->a:Ljava/lang/String;

    .line 284
    .line 285
    iput-object v2, v6, Lr2/b;->b:Ljava/lang/String;

    .line 286
    .line 287
    iput-object v1, v6, Lr2/b;->c:Ljava/lang/String;

    .line 288
    .line 289
    iput-object v5, v6, Lr2/b;->d:Ljava/lang/String;

    .line 290
    .line 291
    iput-object v4, v6, Lr2/b;->e:LO7/a;

    .line 292
    .line 293
    iput-object v3, v6, Lr2/b;->f:LO7/a;

    .line 294
    .line 295
    invoke-virtual {v6}, Landroid/app/Dialog;->show()V

    .line 296
    .line 297
    .line 298
    :cond_a
    :goto_6
    return-void

    .line 299
    :pswitch_7
    check-cast v3, Landroidx/mediarouter/app/e;

    .line 300
    .line 301
    invoke-virtual {v3}, Landroidx/mediarouter/app/e;->dismiss()V

    .line 302
    .line 303
    .line 304
    return-void

    .line 305
    :pswitch_8
    check-cast v3, LQ2/I;

    .line 306
    .line 307
    invoke-virtual {v3}, LQ2/I;->g()V

    .line 308
    .line 309
    .line 310
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 311
    .line 312
    .line 313
    move-result v0

    .line 314
    const v1, 0x7f0a014d

    .line 315
    .line 316
    .line 317
    if-ne v0, v1, :cond_b

    .line 318
    .line 319
    iget-object p1, v3, LQ2/I;->q:Landroid/animation/ValueAnimator;

    .line 320
    .line 321
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 322
    .line 323
    .line 324
    goto :goto_7

    .line 325
    :cond_b
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 326
    .line 327
    .line 328
    move-result p1

    .line 329
    const v0, 0x7f0a014c

    .line 330
    .line 331
    .line 332
    if-ne p1, v0, :cond_c

    .line 333
    .line 334
    iget-object p1, v3, LQ2/I;->r:Landroid/animation/ValueAnimator;

    .line 335
    .line 336
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 337
    .line 338
    .line 339
    :cond_c
    :goto_7
    return-void

    .line 340
    :pswitch_9
    check-cast v3, LQ2/y;

    .line 341
    .line 342
    iget-object p1, v3, LQ2/y;->f:LQ2/D;

    .line 343
    .line 344
    iget-object v0, p1, LQ2/D;->m0:Lj3/r0;

    .line 345
    .line 346
    if-eqz v0, :cond_d

    .line 347
    .line 348
    invoke-interface {v0}, Lj3/r0;->M()Li4/v;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    iget-object v1, p1, LQ2/D;->m0:Lj3/r0;

    .line 353
    .line 354
    invoke-virtual {v0}, Li4/v;->a()Li4/u;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    const/4 v2, 0x3

    .line 359
    invoke-virtual {v0, v2}, Li4/u;->b(I)Li4/u;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    invoke-virtual {v0}, Li4/u;->d()Li4/u;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    invoke-virtual {v0}, Li4/u;->a()Li4/v;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    invoke-interface {v1, v0}, Lj3/r0;->P(Li4/v;)V

    .line 372
    .line 373
    .line 374
    iget-object p1, p1, LQ2/D;->I0:Landroid/widget/PopupWindow;

    .line 375
    .line 376
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 377
    .line 378
    .line 379
    :cond_d
    return-void

    .line 380
    :pswitch_a
    check-cast v3, LQ2/v;

    .line 381
    .line 382
    invoke-virtual {v3}, LF0/r0;->b()I

    .line 383
    .line 384
    .line 385
    move-result p1

    .line 386
    iget-object v0, v3, LQ2/v;->x:LQ2/D;

    .line 387
    .line 388
    if-nez p1, :cond_e

    .line 389
    .line 390
    iget-object p1, v0, LQ2/D;->H0:LQ2/t;

    .line 391
    .line 392
    invoke-virtual {v0, p1}, LQ2/D;->c(LF0/S;)V

    .line 393
    .line 394
    .line 395
    goto :goto_8

    .line 396
    :cond_e
    if-ne p1, v1, :cond_f

    .line 397
    .line 398
    iget-object p1, v0, LQ2/D;->M0:LQ2/o;

    .line 399
    .line 400
    invoke-virtual {v0, p1}, LQ2/D;->c(LF0/S;)V

    .line 401
    .line 402
    .line 403
    goto :goto_8

    .line 404
    :cond_f
    iget-object p1, v0, LQ2/D;->I0:Landroid/widget/PopupWindow;

    .line 405
    .line 406
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 407
    .line 408
    .line 409
    :goto_8
    return-void

    .line 410
    :pswitch_b
    check-cast v3, LQ2/o;

    .line 411
    .line 412
    iget-object p1, v3, LQ2/o;->f:LQ2/D;

    .line 413
    .line 414
    iget-object v0, p1, LQ2/D;->m0:Lj3/r0;

    .line 415
    .line 416
    if-nez v0, :cond_10

    .line 417
    .line 418
    goto :goto_9

    .line 419
    :cond_10
    invoke-interface {v0}, Lj3/r0;->M()Li4/v;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    iget-object v2, p1, LQ2/D;->m0:Lj3/r0;

    .line 424
    .line 425
    sget v3, Ll4/y;->a:I

    .line 426
    .line 427
    invoke-virtual {v0}, Li4/v;->a()Li4/u;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    invoke-virtual {v0, v1}, Li4/u;->b(I)Li4/u;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    invoke-virtual {v0, v1}, Li4/u;->h(I)Li4/u;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    invoke-virtual {v0}, Li4/u;->a()Li4/v;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    invoke-interface {v2, v0}, Lj3/r0;->P(Li4/v;)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    const v2, 0x7f1400a5

    .line 451
    .line 452
    .line 453
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    iget-object v2, p1, LQ2/D;->G0:LQ2/w;

    .line 458
    .line 459
    iget-object v2, v2, LQ2/w;->e:[Ljava/lang/String;

    .line 460
    .line 461
    aput-object v0, v2, v1

    .line 462
    .line 463
    iget-object p1, p1, LQ2/D;->I0:Landroid/widget/PopupWindow;

    .line 464
    .line 465
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 466
    .line 467
    .line 468
    :goto_9
    return-void

    .line 469
    :pswitch_c
    check-cast v3, Lcom/anilab/android/ui/comment/CommentListFragment;

    .line 470
    .line 471
    invoke-virtual {v3}, Li0/v;->k()Li0/y;

    .line 472
    .line 473
    .line 474
    move-result-object p1

    .line 475
    if-eqz p1, :cond_11

    .line 476
    .line 477
    invoke-static {p1}, Lcom/google/android/gms/internal/measurement/Y1;->p(Landroid/app/Activity;)V

    .line 478
    .line 479
    .line 480
    :cond_11
    return-void

    .line 481
    :pswitch_d
    check-cast v3, LP1/d;

    .line 482
    .line 483
    iget-object p1, v3, LP1/d;->v:Lcom/anilab/android/ui/comment/CommentListFragment;

    .line 484
    .line 485
    invoke-virtual {p1}, Li0/v;->k()Li0/y;

    .line 486
    .line 487
    .line 488
    move-result-object p1

    .line 489
    instance-of v0, p1, Lcom/anilab/android/ui/player/PlayerActivity;

    .line 490
    .line 491
    if-eqz v0, :cond_12

    .line 492
    .line 493
    move-object v2, p1

    .line 494
    check-cast v2, Lcom/anilab/android/ui/player/PlayerActivity;

    .line 495
    .line 496
    :cond_12
    if-eqz v2, :cond_13

    .line 497
    .line 498
    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/Y1;->p(Landroid/app/Activity;)V

    .line 499
    .line 500
    .line 501
    :cond_13
    return-void

    .line 502
    :pswitch_e
    check-cast v3, LP1/b;

    .line 503
    .line 504
    iget-object p1, v3, LP1/b;->v:Lcom/anilab/android/ui/comment/CommentListFragment;

    .line 505
    .line 506
    invoke-virtual {p1}, Li0/v;->k()Li0/y;

    .line 507
    .line 508
    .line 509
    move-result-object p1

    .line 510
    instance-of v0, p1, Lcom/anilab/android/ui/player/PlayerActivity;

    .line 511
    .line 512
    if-eqz v0, :cond_14

    .line 513
    .line 514
    move-object v2, p1

    .line 515
    check-cast v2, Lcom/anilab/android/ui/player/PlayerActivity;

    .line 516
    .line 517
    :cond_14
    if-eqz v2, :cond_15

    .line 518
    .line 519
    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/Y1;->p(Landroid/app/Activity;)V

    .line 520
    .line 521
    .line 522
    :cond_15
    return-void

    .line 523
    :pswitch_f
    check-cast v3, LK5/y;

    .line 524
    .line 525
    iget-object p1, v3, LK5/y;->f:Landroid/widget/EditText;

    .line 526
    .line 527
    if-nez p1, :cond_16

    .line 528
    .line 529
    goto :goto_b

    .line 530
    :cond_16
    invoke-virtual {p1}, Landroid/widget/TextView;->getSelectionEnd()I

    .line 531
    .line 532
    .line 533
    move-result p1

    .line 534
    iget-object v0, v3, LK5/y;->f:Landroid/widget/EditText;

    .line 535
    .line 536
    if-eqz v0, :cond_17

    .line 537
    .line 538
    invoke-virtual {v0}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    instance-of v0, v0, Landroid/text/method/PasswordTransformationMethod;

    .line 543
    .line 544
    if-eqz v0, :cond_17

    .line 545
    .line 546
    iget-object v0, v3, LK5/y;->f:Landroid/widget/EditText;

    .line 547
    .line 548
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 549
    .line 550
    .line 551
    goto :goto_a

    .line 552
    :cond_17
    iget-object v0, v3, LK5/y;->f:Landroid/widget/EditText;

    .line 553
    .line 554
    invoke-static {}, Landroid/text/method/PasswordTransformationMethod;->getInstance()Landroid/text/method/PasswordTransformationMethod;

    .line 555
    .line 556
    .line 557
    move-result-object v1

    .line 558
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 559
    .line 560
    .line 561
    :goto_a
    if-ltz p1, :cond_18

    .line 562
    .line 563
    iget-object v0, v3, LK5/y;->f:Landroid/widget/EditText;

    .line 564
    .line 565
    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setSelection(I)V

    .line 566
    .line 567
    .line 568
    :cond_18
    invoke-virtual {v3}, LK5/r;->q()V

    .line 569
    .line 570
    .line 571
    :goto_b
    return-void

    .line 572
    :pswitch_10
    check-cast v3, LK5/l;

    .line 573
    .line 574
    invoke-virtual {v3}, LK5/l;->u()V

    .line 575
    .line 576
    .line 577
    return-void

    .line 578
    :pswitch_11
    check-cast v3, LK5/e;

    .line 579
    .line 580
    iget-object p1, v3, LK5/e;->i:Landroid/widget/EditText;

    .line 581
    .line 582
    if-nez p1, :cond_19

    .line 583
    .line 584
    goto :goto_c

    .line 585
    :cond_19
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 586
    .line 587
    .line 588
    move-result-object p1

    .line 589
    if-eqz p1, :cond_1a

    .line 590
    .line 591
    invoke-interface {p1}, Landroid/text/Editable;->clear()V

    .line 592
    .line 593
    .line 594
    :cond_1a
    invoke-virtual {v3}, LK5/r;->q()V

    .line 595
    .line 596
    .line 597
    :goto_c
    return-void

    .line 598
    nop

    .line 599
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
