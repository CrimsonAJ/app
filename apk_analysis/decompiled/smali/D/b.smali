.class public abstract LD/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/Class;

.field public static final b:Ljava/lang/reflect/Field;

.field public static final c:Ljava/lang/reflect/Field;

.field public static final d:Ljava/lang/reflect/Method;

.field public static final e:Ljava/lang/reflect/Method;

.field public static final f:Ljava/lang/reflect/Method;

.field public static final g:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    const/4 v0, 0x3

    .line 2
    const-class v1, Landroid/os/IBinder;

    .line 3
    .line 4
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 5
    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x1

    .line 9
    const-class v6, Landroid/app/Activity;

    .line 10
    .line 11
    new-instance v7, Landroid/os/Handler;

    .line 12
    .line 13
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v8

    .line 17
    invoke-direct {v7, v8}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 18
    .line 19
    .line 20
    sput-object v7, LD/b;->g:Landroid/os/Handler;

    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    :try_start_0
    const-string v8, "android.app.ActivityThread"

    .line 24
    .line 25
    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-object v8, v7

    .line 31
    :goto_0
    sput-object v8, LD/b;->a:Ljava/lang/Class;

    .line 32
    .line 33
    :try_start_1
    const-string v8, "mMainThread"

    .line 34
    .line 35
    invoke-virtual {v6, v8}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    invoke-virtual {v8, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :catchall_1
    move-object v8, v7

    .line 44
    :goto_1
    sput-object v8, LD/b;->b:Ljava/lang/reflect/Field;

    .line 45
    .line 46
    :try_start_2
    const-string v8, "mToken"

    .line 47
    .line 48
    invoke-virtual {v6, v8}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    invoke-virtual {v6, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :catchall_2
    move-object v6, v7

    .line 57
    :goto_2
    sput-object v6, LD/b;->c:Ljava/lang/reflect/Field;

    .line 58
    .line 59
    sget-object v6, LD/b;->a:Ljava/lang/Class;

    .line 60
    .line 61
    const-string v8, "performStopActivity"

    .line 62
    .line 63
    if-nez v6, :cond_0

    .line 64
    .line 65
    :catchall_3
    move-object v6, v7

    .line 66
    goto :goto_3

    .line 67
    :cond_0
    :try_start_3
    new-array v9, v0, [Ljava/lang/Class;

    .line 68
    .line 69
    aput-object v1, v9, v4

    .line 70
    .line 71
    aput-object v2, v9, v5

    .line 72
    .line 73
    const-class v10, Ljava/lang/String;

    .line 74
    .line 75
    aput-object v10, v9, v3

    .line 76
    .line 77
    invoke-virtual {v6, v8, v9}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    invoke-virtual {v6, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 82
    .line 83
    .line 84
    :goto_3
    sput-object v6, LD/b;->d:Ljava/lang/reflect/Method;

    .line 85
    .line 86
    sget-object v6, LD/b;->a:Ljava/lang/Class;

    .line 87
    .line 88
    if-nez v6, :cond_1

    .line 89
    .line 90
    :catchall_4
    move-object v6, v7

    .line 91
    goto :goto_4

    .line 92
    :cond_1
    :try_start_4
    new-array v9, v3, [Ljava/lang/Class;

    .line 93
    .line 94
    aput-object v1, v9, v4

    .line 95
    .line 96
    aput-object v2, v9, v5

    .line 97
    .line 98
    invoke-virtual {v6, v8, v9}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    invoke-virtual {v6, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 103
    .line 104
    .line 105
    :goto_4
    sput-object v6, LD/b;->e:Ljava/lang/reflect/Method;

    .line 106
    .line 107
    sget-object v6, LD/b;->a:Ljava/lang/Class;

    .line 108
    .line 109
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 110
    .line 111
    const/16 v9, 0x1a

    .line 112
    .line 113
    if-eq v8, v9, :cond_2

    .line 114
    .line 115
    const/16 v9, 0x1b

    .line 116
    .line 117
    if-ne v8, v9, :cond_4

    .line 118
    .line 119
    :cond_2
    if-nez v6, :cond_3

    .line 120
    .line 121
    goto :goto_5

    .line 122
    :cond_3
    :try_start_5
    const-string v8, "requestRelaunchActivity"

    .line 123
    .line 124
    const/16 v9, 0x9

    .line 125
    .line 126
    new-array v9, v9, [Ljava/lang/Class;

    .line 127
    .line 128
    aput-object v1, v9, v4

    .line 129
    .line 130
    const-class v1, Ljava/util/List;

    .line 131
    .line 132
    aput-object v1, v9, v5

    .line 133
    .line 134
    aput-object v1, v9, v3

    .line 135
    .line 136
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 137
    .line 138
    aput-object v1, v9, v0

    .line 139
    .line 140
    const/4 v0, 0x4

    .line 141
    aput-object v2, v9, v0

    .line 142
    .line 143
    const-class v0, Landroid/content/res/Configuration;

    .line 144
    .line 145
    const/4 v1, 0x5

    .line 146
    aput-object v0, v9, v1

    .line 147
    .line 148
    const/4 v1, 0x6

    .line 149
    aput-object v0, v9, v1

    .line 150
    .line 151
    const/4 v0, 0x7

    .line 152
    aput-object v2, v9, v0

    .line 153
    .line 154
    const/16 v0, 0x8

    .line 155
    .line 156
    aput-object v2, v9, v0

    .line 157
    .line 158
    invoke-virtual {v6, v8, v9}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-virtual {v0, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 163
    .line 164
    .line 165
    move-object v7, v0

    .line 166
    :catchall_5
    :cond_4
    :goto_5
    sput-object v7, LD/b;->f:Ljava/lang/reflect/Method;

    .line 167
    .line 168
    return-void
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
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
    .line 241
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
.end method
