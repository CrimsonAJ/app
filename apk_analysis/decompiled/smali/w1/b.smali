.class public final Lw1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw1/g;


# instance fields
.field public final synthetic a:I

.field public final b:Landroid/net/Uri;

.field public final c:LC1/m;


# direct methods
.method public synthetic constructor <init>(Landroid/net/Uri;LC1/m;I)V
    .locals 0

    .line 1
    iput p3, p0, Lw1/b;->a:I

    iput-object p1, p0, Lw1/b;->b:Landroid/net/Uri;

    iput-object p2, p0, Lw1/b;->c:LC1/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LE7/d;)Ljava/lang/Object;
    .locals 11

    .line 1
    const/4 p1, 0x3

    .line 2
    const/4 v0, 0x2

    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    sget-object v3, Lu1/e;->c:Lu1/e;

    .line 6
    .line 7
    iget-object v4, p0, Lw1/b;->c:LC1/m;

    .line 8
    .line 9
    iget-object v5, p0, Lw1/b;->b:Landroid/net/Uri;

    .line 10
    .line 11
    iget v6, p0, Lw1/b;->a:I

    .line 12
    .line 13
    packed-switch v6, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v5}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string v6, "Invalid android.resource URI: "

    .line 21
    .line 22
    if-eqz p1, :cond_e

    .line 23
    .line 24
    invoke-static {p1}, LW7/d;->U(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v7

    .line 28
    if-nez v7, :cond_0

    .line 29
    .line 30
    move-object v2, p1

    .line 31
    :cond_0
    if-eqz v2, :cond_e

    .line 32
    .line 33
    invoke-virtual {v5}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {p1}, LB7/k;->w0(Ljava/util/List;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Ljava/lang/String;

    .line 42
    .line 43
    if-eqz p1, :cond_d

    .line 44
    .line 45
    invoke-static {p1}, LW7/k;->E(Ljava/lang/String;)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-eqz p1, :cond_d

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    iget-object v5, v4, LC1/m;->a:Landroid/content/Context;

    .line 56
    .line 57
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    invoke-virtual {v2, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    if-eqz v6, :cond_1

    .line 66
    .line 67
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    goto :goto_0

    .line 72
    :cond_1
    invoke-virtual {v5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    invoke-virtual {v6, v2}, Landroid/content/pm/PackageManager;->getResourcesForApplication(Ljava/lang/String;)Landroid/content/res/Resources;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    :goto_0
    new-instance v7, Landroid/util/TypedValue;

    .line 81
    .line 82
    invoke-direct {v7}, Landroid/util/TypedValue;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v6, p1, v7, v1}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 86
    .line 87
    .line 88
    iget-object v7, v7, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    .line 89
    .line 90
    const/4 v8, 0x6

    .line 91
    const/16 v9, 0x2f

    .line 92
    .line 93
    const/4 v10, 0x0

    .line 94
    invoke-static {v7, v9, v10, v8}, LW7/d;->V(Ljava/lang/CharSequence;CII)I

    .line 95
    .line 96
    .line 97
    move-result v8

    .line 98
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 99
    .line 100
    .line 101
    move-result v9

    .line 102
    invoke-interface {v7, v8, v9}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    invoke-static {v8, v7}, LH1/f;->b(Landroid/webkit/MimeTypeMap;Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    const-string v8, "text/xml"

    .line 119
    .line 120
    invoke-static {v7, v8}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v8

    .line 124
    if-eqz v8, :cond_c

    .line 125
    .line 126
    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    invoke-virtual {v2, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    const-string v7, "Invalid resource ID: "

    .line 135
    .line 136
    if-eqz v2, :cond_3

    .line 137
    .line 138
    invoke-static {v5, p1}, La/a;->q(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    if-eqz v0, :cond_2

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_2
    invoke-static {p1, v7}, Lcom/google/android/gms/internal/measurement/k1;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 150
    .line 151
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw v0

    .line 159
    :cond_3
    invoke-virtual {v6, p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 164
    .line 165
    .line 166
    move-result v8

    .line 167
    :goto_1
    if-eq v8, v0, :cond_4

    .line 168
    .line 169
    if-eq v8, v1, :cond_4

    .line 170
    .line 171
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 172
    .line 173
    .line 174
    move-result v8

    .line 175
    goto :goto_1

    .line 176
    :cond_4
    if-ne v8, v0, :cond_b

    .line 177
    .line 178
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 179
    .line 180
    const/16 v8, 0x18

    .line 181
    .line 182
    if-ge v0, v8, :cond_6

    .line 183
    .line 184
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    const-string v8, "vector"

    .line 189
    .line 190
    invoke-static {v0, v8}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v8

    .line 194
    if-eqz v8, :cond_5

    .line 195
    .line 196
    invoke-static {v2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    invoke-virtual {v5}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    new-instance v7, LY0/r;

    .line 205
    .line 206
    invoke-direct {v7}, LY0/r;-><init>()V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v7, v6, v2, p1, v0}, LY0/r;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    .line 210
    .line 211
    .line 212
    :goto_2
    move-object v0, v7

    .line 213
    goto :goto_3

    .line 214
    :cond_5
    const-string v8, "animated-vector"

    .line 215
    .line 216
    invoke-static {v0, v8}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    if-eqz v0, :cond_6

    .line 221
    .line 222
    invoke-static {v2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    invoke-virtual {v5}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    new-instance v7, LY0/f;

    .line 231
    .line 232
    invoke-direct {v7, v5}, LY0/f;-><init>(Landroid/content/Context;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v7, v6, v2, p1, v0}, LY0/f;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    .line 236
    .line 237
    .line 238
    goto :goto_2

    .line 239
    :cond_6
    invoke-virtual {v5}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    sget-object v2, LG/l;->a:Ljava/lang/ThreadLocal;

    .line 244
    .line 245
    invoke-virtual {v6, p1, v0}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    if-eqz v0, :cond_a

    .line 250
    .line 251
    :goto_3
    instance-of p1, v0, Landroid/graphics/drawable/VectorDrawable;

    .line 252
    .line 253
    if-nez p1, :cond_8

    .line 254
    .line 255
    instance-of p1, v0, LY0/r;

    .line 256
    .line 257
    if-eqz p1, :cond_7

    .line 258
    .line 259
    goto :goto_4

    .line 260
    :cond_7
    move v1, v10

    .line 261
    :cond_8
    :goto_4
    new-instance p1, Lw1/d;

    .line 262
    .line 263
    if-eqz v1, :cond_9

    .line 264
    .line 265
    iget-object v2, v4, LC1/m;->b:Landroid/graphics/Bitmap$Config;

    .line 266
    .line 267
    iget-object v6, v4, LC1/m;->d:LD1/h;

    .line 268
    .line 269
    iget-object v7, v4, LC1/m;->e:LD1/g;

    .line 270
    .line 271
    iget-boolean v4, v4, LC1/m;->f:Z

    .line 272
    .line 273
    invoke-static {v0, v2, v6, v7, v4}, Ll6/b;->b(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;LD1/h;LD1/g;Z)Landroid/graphics/Bitmap;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    new-instance v4, Landroid/graphics/drawable/BitmapDrawable;

    .line 282
    .line 283
    invoke-direct {v4, v2, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 284
    .line 285
    .line 286
    move-object v0, v4

    .line 287
    :cond_9
    invoke-direct {p1, v0, v1, v3}, Lw1/d;-><init>(Landroid/graphics/drawable/Drawable;ZLu1/e;)V

    .line 288
    .line 289
    .line 290
    goto :goto_5

    .line 291
    :cond_a
    invoke-static {p1, v7}, Lcom/google/android/gms/internal/measurement/k1;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 296
    .line 297
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    throw v0

    .line 305
    :cond_b
    new-instance p1, Lorg/xmlpull/v1/XmlPullParserException;

    .line 306
    .line 307
    const-string v0, "No start tag found."

    .line 308
    .line 309
    invoke-direct {p1, v0}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    throw p1

    .line 313
    :cond_c
    new-instance v0, Landroid/util/TypedValue;

    .line 314
    .line 315
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v6, p1, v0}, Landroid/content/res/Resources;->openRawResource(ILandroid/util/TypedValue;)Ljava/io/InputStream;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    new-instance v1, Lw1/m;

    .line 323
    .line 324
    invoke-static {p1}, Lv4/e;->P(Ljava/io/InputStream;)Lx8/c;

    .line 325
    .line 326
    .line 327
    move-result-object p1

    .line 328
    invoke-static {p1}, Lv4/e;->b(Lx8/I;)Lx8/C;

    .line 329
    .line 330
    .line 331
    move-result-object p1

    .line 332
    new-instance v2, Lu1/n;

    .line 333
    .line 334
    iget v0, v0, Landroid/util/TypedValue;->density:I

    .line 335
    .line 336
    invoke-direct {v2, v0}, Lu1/n;-><init>(I)V

    .line 337
    .line 338
    .line 339
    new-instance v0, Lu1/o;

    .line 340
    .line 341
    invoke-direct {v0, p1, v2}, Lu1/o;-><init>(Lx8/i;LO4/h;)V

    .line 342
    .line 343
    .line 344
    invoke-direct {v1, v0, v7, v3}, Lw1/m;-><init>(Lu1/m;Ljava/lang/String;Lu1/e;)V

    .line 345
    .line 346
    .line 347
    move-object p1, v1

    .line 348
    :goto_5
    return-object p1

    .line 349
    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 350
    .line 351
    new-instance v0, Ljava/lang/StringBuilder;

    .line 352
    .line 353
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    throw p1

    .line 367
    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 368
    .line 369
    new-instance v0, Ljava/lang/StringBuilder;

    .line 370
    .line 371
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    throw p1

    .line 385
    :pswitch_0
    iget-object v6, v4, LC1/m;->a:Landroid/content/Context;

    .line 386
    .line 387
    invoke-virtual {v6}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 388
    .line 389
    .line 390
    move-result-object v6

    .line 391
    invoke-virtual {v5}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v7

    .line 395
    const-string v8, "com.android.contacts"

    .line 396
    .line 397
    invoke-static {v7, v8}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    move-result v7

    .line 401
    const-string v8, "\'."

    .line 402
    .line 403
    if-eqz v7, :cond_11

    .line 404
    .line 405
    invoke-virtual {v5}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v7

    .line 409
    const-string v9, "display_photo"

    .line 410
    .line 411
    invoke-static {v7, v9}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    move-result v7

    .line 415
    if-eqz v7, :cond_11

    .line 416
    .line 417
    const-string p1, "r"

    .line 418
    .line 419
    invoke-virtual {v6, v5, p1}, Landroid/content/ContentResolver;->openAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    .line 420
    .line 421
    .line 422
    move-result-object p1

    .line 423
    if-eqz p1, :cond_f

    .line 424
    .line 425
    invoke-virtual {p1}, Landroid/content/res/AssetFileDescriptor;->createInputStream()Ljava/io/FileInputStream;

    .line 426
    .line 427
    .line 428
    move-result-object v2

    .line 429
    :cond_f
    if-eqz v2, :cond_10

    .line 430
    .line 431
    goto/16 :goto_a

    .line 432
    .line 433
    :cond_10
    new-instance p1, Ljava/lang/StringBuilder;

    .line 434
    .line 435
    const-string v0, "Unable to find a contact photo associated with \'"

    .line 436
    .line 437
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object p1

    .line 450
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 451
    .line 452
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object p1

    .line 456
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    throw v0

    .line 460
    :cond_11
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 461
    .line 462
    const/16 v9, 0x1d

    .line 463
    .line 464
    if-lt v7, v9, :cond_18

    .line 465
    .line 466
    invoke-virtual {v5}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v7

    .line 470
    const-string v9, "media"

    .line 471
    .line 472
    invoke-static {v7, v9}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 473
    .line 474
    .line 475
    move-result v7

    .line 476
    if-nez v7, :cond_12

    .line 477
    .line 478
    goto/16 :goto_9

    .line 479
    .line 480
    :cond_12
    invoke-virtual {v5}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    .line 481
    .line 482
    .line 483
    move-result-object v7

    .line 484
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 485
    .line 486
    .line 487
    move-result v9

    .line 488
    if-lt v9, p1, :cond_18

    .line 489
    .line 490
    add-int/lit8 p1, v9, -0x3

    .line 491
    .line 492
    invoke-interface {v7, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object p1

    .line 496
    const-string v10, "audio"

    .line 497
    .line 498
    invoke-static {p1, v10}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 499
    .line 500
    .line 501
    move-result p1

    .line 502
    if-eqz p1, :cond_18

    .line 503
    .line 504
    sub-int/2addr v9, v0

    .line 505
    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object p1

    .line 509
    const-string v0, "albums"

    .line 510
    .line 511
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 512
    .line 513
    .line 514
    move-result p1

    .line 515
    if-eqz p1, :cond_18

    .line 516
    .line 517
    iget-object p1, v4, LC1/m;->d:LD1/h;

    .line 518
    .line 519
    iget-object v0, p1, LD1/h;->a:Ls8/n;

    .line 520
    .line 521
    instance-of v4, v0, LD1/a;

    .line 522
    .line 523
    if-eqz v4, :cond_13

    .line 524
    .line 525
    check-cast v0, LD1/a;

    .line 526
    .line 527
    goto :goto_6

    .line 528
    :cond_13
    move-object v0, v2

    .line 529
    :goto_6
    if-eqz v0, :cond_15

    .line 530
    .line 531
    iget-object p1, p1, LD1/h;->b:Ls8/n;

    .line 532
    .line 533
    instance-of v4, p1, LD1/a;

    .line 534
    .line 535
    if-eqz v4, :cond_14

    .line 536
    .line 537
    check-cast p1, LD1/a;

    .line 538
    .line 539
    goto :goto_7

    .line 540
    :cond_14
    move-object p1, v2

    .line 541
    :goto_7
    if-eqz p1, :cond_15

    .line 542
    .line 543
    new-instance v4, Landroid/os/Bundle;

    .line 544
    .line 545
    invoke-direct {v4, v1}, Landroid/os/Bundle;-><init>(I)V

    .line 546
    .line 547
    .line 548
    new-instance v1, Landroid/graphics/Point;

    .line 549
    .line 550
    iget v0, v0, LD1/a;->m:I

    .line 551
    .line 552
    iget p1, p1, LD1/a;->m:I

    .line 553
    .line 554
    invoke-direct {v1, v0, p1}, Landroid/graphics/Point;-><init>(II)V

    .line 555
    .line 556
    .line 557
    const-string p1, "android.content.extra.SIZE"

    .line 558
    .line 559
    invoke-virtual {v4, p1, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 560
    .line 561
    .line 562
    goto :goto_8

    .line 563
    :cond_15
    move-object v4, v2

    .line 564
    :goto_8
    invoke-static {v6, v5, v4}, Ls8/l;->a(Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/os/Bundle;)Landroid/content/res/AssetFileDescriptor;

    .line 565
    .line 566
    .line 567
    move-result-object p1

    .line 568
    if-eqz p1, :cond_16

    .line 569
    .line 570
    invoke-virtual {p1}, Landroid/content/res/AssetFileDescriptor;->createInputStream()Ljava/io/FileInputStream;

    .line 571
    .line 572
    .line 573
    move-result-object v2

    .line 574
    :cond_16
    if-eqz v2, :cond_17

    .line 575
    .line 576
    goto :goto_a

    .line 577
    :cond_17
    new-instance p1, Ljava/lang/StringBuilder;

    .line 578
    .line 579
    const-string v0, "Unable to find a music thumbnail associated with \'"

    .line 580
    .line 581
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 582
    .line 583
    .line 584
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 585
    .line 586
    .line 587
    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 588
    .line 589
    .line 590
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 591
    .line 592
    .line 593
    move-result-object p1

    .line 594
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 595
    .line 596
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object p1

    .line 600
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 601
    .line 602
    .line 603
    throw v0

    .line 604
    :cond_18
    :goto_9
    invoke-virtual {v6, v5}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 605
    .line 606
    .line 607
    move-result-object v2

    .line 608
    if-eqz v2, :cond_19

    .line 609
    .line 610
    :goto_a
    new-instance p1, Lw1/m;

    .line 611
    .line 612
    invoke-static {v2}, Lv4/e;->P(Ljava/io/InputStream;)Lx8/c;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    invoke-static {v0}, Lv4/e;->b(Lx8/I;)Lx8/C;

    .line 617
    .line 618
    .line 619
    move-result-object v0

    .line 620
    new-instance v1, Lu1/a;

    .line 621
    .line 622
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 623
    .line 624
    .line 625
    new-instance v2, Lu1/o;

    .line 626
    .line 627
    invoke-direct {v2, v0, v1}, Lu1/o;-><init>(Lx8/i;LO4/h;)V

    .line 628
    .line 629
    .line 630
    invoke-virtual {v6, v5}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    invoke-direct {p1, v2, v0, v3}, Lw1/m;-><init>(Lu1/m;Ljava/lang/String;Lu1/e;)V

    .line 635
    .line 636
    .line 637
    return-object p1

    .line 638
    :cond_19
    new-instance p1, Ljava/lang/StringBuilder;

    .line 639
    .line 640
    const-string v0, "Unable to open \'"

    .line 641
    .line 642
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 643
    .line 644
    .line 645
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 646
    .line 647
    .line 648
    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 649
    .line 650
    .line 651
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 652
    .line 653
    .line 654
    move-result-object p1

    .line 655
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 656
    .line 657
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 658
    .line 659
    .line 660
    move-result-object p1

    .line 661
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 662
    .line 663
    .line 664
    throw v0

    .line 665
    :pswitch_1
    invoke-virtual {v5}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    .line 666
    .line 667
    .line 668
    move-result-object p1

    .line 669
    invoke-static {p1}, LB7/k;->m0(Ljava/util/List;)Ljava/util/List;

    .line 670
    .line 671
    .line 672
    move-result-object v5

    .line 673
    const/4 v8, 0x0

    .line 674
    const/4 v9, 0x0

    .line 675
    const-string v6, "/"

    .line 676
    .line 677
    const/4 v7, 0x0

    .line 678
    const/16 v10, 0x3e

    .line 679
    .line 680
    invoke-static/range {v5 .. v10}, LB7/k;->u0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LO7/l;I)Ljava/lang/String;

    .line 681
    .line 682
    .line 683
    move-result-object p1

    .line 684
    new-instance v0, Lw1/m;

    .line 685
    .line 686
    iget-object v1, v4, LC1/m;->a:Landroid/content/Context;

    .line 687
    .line 688
    invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 689
    .line 690
    .line 691
    move-result-object v1

    .line 692
    invoke-virtual {v1, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 693
    .line 694
    .line 695
    move-result-object v1

    .line 696
    invoke-static {v1}, Lv4/e;->P(Ljava/io/InputStream;)Lx8/c;

    .line 697
    .line 698
    .line 699
    move-result-object v1

    .line 700
    invoke-static {v1}, Lv4/e;->b(Lx8/I;)Lx8/C;

    .line 701
    .line 702
    .line 703
    move-result-object v1

    .line 704
    new-instance v2, Lu1/a;

    .line 705
    .line 706
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 707
    .line 708
    .line 709
    new-instance v4, Lu1/o;

    .line 710
    .line 711
    invoke-direct {v4, v1, v2}, Lu1/o;-><init>(Lx8/i;LO4/h;)V

    .line 712
    .line 713
    .line 714
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 715
    .line 716
    .line 717
    move-result-object v1

    .line 718
    invoke-static {v1, p1}, LH1/f;->b(Landroid/webkit/MimeTypeMap;Ljava/lang/String;)Ljava/lang/String;

    .line 719
    .line 720
    .line 721
    move-result-object p1

    .line 722
    invoke-direct {v0, v4, p1, v3}, Lw1/m;-><init>(Lu1/m;Ljava/lang/String;Lu1/e;)V

    .line 723
    .line 724
    .line 725
    return-object v0

    .line 726
    nop

    .line 727
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
