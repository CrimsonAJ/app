.class public Lcom/google/firebase/FirebaseCommonRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    const/16 v1, 0x5f

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/16 v0, 0x2f

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method


# virtual methods
.method public final getComponents()Ljava/util/List;
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x2

    .line 4
    new-instance v3, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    const-class v4, Lb7/b;

    .line 10
    .line 11
    invoke-static {v4}, Ls6/b;->a(Ljava/lang/Class;)Ls6/a;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    new-instance v6, Ls6/h;

    .line 16
    .line 17
    const-class v7, Lb7/a;

    .line 18
    .line 19
    invoke-direct {v6, v2, v1, v7}, Ls6/h;-><init>(IILjava/lang/Class;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v5, v6}, Ls6/a;->a(Ls6/h;)V

    .line 23
    .line 24
    .line 25
    new-instance v6, LX0/k;

    .line 26
    .line 27
    const/4 v7, 0x5

    .line 28
    invoke-direct {v6, v7}, LX0/k;-><init>(I)V

    .line 29
    .line 30
    .line 31
    iput-object v6, v5, Ls6/a;->f:Ls6/d;

    .line 32
    .line 33
    invoke-virtual {v5}, Ls6/a;->b()Ls6/b;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    new-instance v5, Ls6/p;

    .line 41
    .line 42
    const-class v6, Lr6/a;

    .line 43
    .line 44
    const-class v7, Ljava/util/concurrent/Executor;

    .line 45
    .line 46
    invoke-direct {v5, v6, v7}, Ls6/p;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 47
    .line 48
    .line 49
    new-array v6, v2, [Ljava/lang/Class;

    .line 50
    .line 51
    const-class v7, LQ6/g;

    .line 52
    .line 53
    aput-object v7, v6, v1

    .line 54
    .line 55
    const-class v7, LQ6/h;

    .line 56
    .line 57
    aput-object v7, v6, v0

    .line 58
    .line 59
    new-instance v7, Ls6/a;

    .line 60
    .line 61
    const-class v8, LQ6/e;

    .line 62
    .line 63
    invoke-direct {v7, v8, v6}, Ls6/a;-><init>(Ljava/lang/Class;[Ljava/lang/Class;)V

    .line 64
    .line 65
    .line 66
    const-class v6, Landroid/content/Context;

    .line 67
    .line 68
    invoke-static {v6}, Ls6/h;->a(Ljava/lang/Class;)Ls6/h;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-virtual {v7, v6}, Ls6/a;->a(Ls6/h;)V

    .line 73
    .line 74
    .line 75
    const-class v6, Ll6/f;

    .line 76
    .line 77
    invoke-static {v6}, Ls6/h;->a(Ljava/lang/Class;)Ls6/h;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    invoke-virtual {v7, v6}, Ls6/a;->a(Ls6/h;)V

    .line 82
    .line 83
    .line 84
    new-instance v6, Ls6/h;

    .line 85
    .line 86
    const-class v8, LQ6/f;

    .line 87
    .line 88
    invoke-direct {v6, v2, v1, v8}, Ls6/h;-><init>(IILjava/lang/Class;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v7, v6}, Ls6/a;->a(Ls6/h;)V

    .line 92
    .line 93
    .line 94
    new-instance v6, Ls6/h;

    .line 95
    .line 96
    invoke-direct {v6, v0, v0, v4}, Ls6/h;-><init>(IILjava/lang/Class;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v7, v6}, Ls6/a;->a(Ls6/h;)V

    .line 100
    .line 101
    .line 102
    new-instance v4, Ls6/h;

    .line 103
    .line 104
    invoke-direct {v4, v5, v0, v1}, Ls6/h;-><init>(Ls6/p;II)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v7, v4}, Ls6/a;->a(Ls6/h;)V

    .line 108
    .line 109
    .line 110
    new-instance v4, LQ6/b;

    .line 111
    .line 112
    invoke-direct {v4, v5, v1}, LQ6/b;-><init>(Ls6/p;I)V

    .line 113
    .line 114
    .line 115
    iput-object v4, v7, Ls6/a;->f:Ls6/d;

    .line 116
    .line 117
    invoke-virtual {v7}, Ls6/a;->b()Ls6/b;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 125
    .line 126
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    const-string v4, "fire-android"

    .line 131
    .line 132
    invoke-static {v4, v1}, LM4/a;->c(Ljava/lang/String;Ljava/lang/String;)Ls6/b;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    const-string v1, "fire-core"

    .line 140
    .line 141
    const-string v4, "21.0.0"

    .line 142
    .line 143
    invoke-static {v1, v4}, LM4/a;->c(Ljava/lang/String;Ljava/lang/String;)Ls6/b;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    sget-object v1, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    .line 151
    .line 152
    invoke-static {v1}, Lcom/google/firebase/FirebaseCommonRegistrar;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    const-string v4, "device-name"

    .line 157
    .line 158
    invoke-static {v4, v1}, LM4/a;->c(Ljava/lang/String;Ljava/lang/String;)Ls6/b;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 166
    .line 167
    invoke-static {v1}, Lcom/google/firebase/FirebaseCommonRegistrar;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    const-string v4, "device-model"

    .line 172
    .line 173
    invoke-static {v4, v1}, LM4/a;->c(Ljava/lang/String;Ljava/lang/String;)Ls6/b;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    sget-object v1, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 181
    .line 182
    invoke-static {v1}, Lcom/google/firebase/FirebaseCommonRegistrar;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    const-string v4, "device-brand"

    .line 187
    .line 188
    invoke-static {v4, v1}, LM4/a;->c(Ljava/lang/String;Ljava/lang/String;)Ls6/b;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    new-instance v1, Lk8/a;

    .line 196
    .line 197
    invoke-direct {v1, v0}, Lk8/a;-><init>(I)V

    .line 198
    .line 199
    .line 200
    const-string v0, "android-target-sdk"

    .line 201
    .line 202
    invoke-static {v0, v1}, LM4/a;->n(Ljava/lang/String;Lk8/a;)Ls6/b;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    new-instance v0, Lk8/a;

    .line 210
    .line 211
    invoke-direct {v0, v2}, Lk8/a;-><init>(I)V

    .line 212
    .line 213
    .line 214
    const-string v1, "android-min-sdk"

    .line 215
    .line 216
    invoke-static {v1, v0}, LM4/a;->n(Ljava/lang/String;Lk8/a;)Ls6/b;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    new-instance v0, Lk8/a;

    .line 224
    .line 225
    const/4 v1, 0x3

    .line 226
    invoke-direct {v0, v1}, Lk8/a;-><init>(I)V

    .line 227
    .line 228
    .line 229
    const-string v1, "android-platform"

    .line 230
    .line 231
    invoke-static {v1, v0}, LM4/a;->n(Ljava/lang/String;Lk8/a;)Ls6/b;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    new-instance v0, Lk8/a;

    .line 239
    .line 240
    const/4 v1, 0x4

    .line 241
    invoke-direct {v0, v1}, Lk8/a;-><init>(I)V

    .line 242
    .line 243
    .line 244
    const-string v1, "android-installer"

    .line 245
    .line 246
    invoke-static {v1, v0}, LM4/a;->n(Ljava/lang/String;Lk8/a;)Ls6/b;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    :try_start_0
    sget-object v0, LA7/d;->b:LA7/d;

    .line 254
    .line 255
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    const-string v0, "2.1.10"
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    .line 259
    .line 260
    goto :goto_0

    .line 261
    :catch_0
    const/4 v0, 0x0

    .line 262
    :goto_0
    if-eqz v0, :cond_0

    .line 263
    .line 264
    const-string v1, "kotlin"

    .line 265
    .line 266
    invoke-static {v1, v0}, LM4/a;->c(Ljava/lang/String;Ljava/lang/String;)Ls6/b;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    :cond_0
    return-object v3
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
.end method
