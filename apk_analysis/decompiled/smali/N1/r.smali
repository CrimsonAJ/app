.class public final LN1/r;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements LO7/a;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LN1/r;->d:I

    iput-object p2, p0, LN1/r;->e:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/i;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LN1/r;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LN1/r;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/anilab/android/ui/movieDetail/FullDetailDialog;

    .line 9
    .line 10
    iget-object v1, v0, Li0/v;->f:Landroid/os/Bundle;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    return-object v1

    .line 15
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 16
    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v3, "Fragment "

    .line 20
    .line 21
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v0, " has null arguments"

    .line 28
    .line 29
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v1

    .line 40
    :pswitch_0
    iget-object v0, p0, LN1/r;->e:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, LN1/r;

    .line 43
    .line 44
    invoke-virtual {v0}, LN1/r;->invoke()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Landroidx/lifecycle/k0;

    .line 49
    .line 50
    return-object v0

    .line 51
    :pswitch_1
    iget-object v0, p0, LN1/r;->e:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Lcom/anilab/android/ui/mal/MalSyncFragment;

    .line 54
    .line 55
    return-object v0

    .line 56
    :pswitch_2
    iget-object v0, p0, LN1/r;->e:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, LB2/i;

    .line 59
    .line 60
    iget-object v0, v0, LB2/i;->b:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, Lc2/l;

    .line 63
    .line 64
    invoke-virtual {v0}, Li0/v;->Y()Li0/v;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    return-object v0

    .line 69
    :pswitch_3
    iget-object v0, p0, LN1/r;->e:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, Lc2/d;

    .line 72
    .line 73
    iget-object v0, v0, Lc2/d;->b:Lc2/i;

    .line 74
    .line 75
    invoke-virtual {v0}, Li0/v;->Y()Li0/v;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    return-object v0

    .line 80
    :pswitch_4
    iget-object v0, p0, LN1/r;->e:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, LN1/r;

    .line 83
    .line 84
    invoke-virtual {v0}, LN1/r;->invoke()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, Landroidx/lifecycle/k0;

    .line 89
    .line 90
    return-object v0

    .line 91
    :pswitch_5
    iget-object v0, p0, LN1/r;->e:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v0, Lcom/anilab/android/ui/main/HostFragment;

    .line 94
    .line 95
    return-object v0

    .line 96
    :pswitch_6
    iget-object v0, p0, LN1/r;->e:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, Landroidx/lifecycle/k0;

    .line 99
    .line 100
    new-instance v1, Landroid/support/v4/media/session/y;

    .line 101
    .line 102
    new-instance v2, Landroidx/lifecycle/X;

    .line 103
    .line 104
    const/4 v3, 0x0

    .line 105
    invoke-direct {v2, v3}, Landroidx/lifecycle/X;-><init>(I)V

    .line 106
    .line 107
    .line 108
    invoke-direct {v1, v0, v2}, Landroid/support/v4/media/session/y;-><init>(Landroidx/lifecycle/k0;Landroidx/lifecycle/h0;)V

    .line 109
    .line 110
    .line 111
    const-string v0, "androidx.lifecycle.internal.SavedStateHandlesVM"

    .line 112
    .line 113
    const-class v2, Landroidx/lifecycle/a0;

    .line 114
    .line 115
    invoke-virtual {v1, v2, v0}, Landroid/support/v4/media/session/y;->K(Ljava/lang/Class;Ljava/lang/String;)Landroidx/lifecycle/e0;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    check-cast v0, Landroidx/lifecycle/a0;

    .line 120
    .line 121
    return-object v0

    .line 122
    :pswitch_7
    iget-object v0, p0, LN1/r;->e:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v0, La2/h;

    .line 125
    .line 126
    invoke-virtual {v0}, La2/h;->invoke()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    check-cast v0, Landroidx/lifecycle/k0;

    .line 131
    .line 132
    return-object v0

    .line 133
    :pswitch_8
    iget-object v0, p0, LN1/r;->e:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v0, LN1/r;

    .line 136
    .line 137
    invoke-virtual {v0}, LN1/r;->invoke()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    check-cast v0, Landroidx/lifecycle/k0;

    .line 142
    .line 143
    return-object v0

    .line 144
    :pswitch_9
    iget-object v0, p0, LN1/r;->e:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v0, Lcom/anilab/android/ui/loginWithEmail/LoginWithEmailFragment;

    .line 147
    .line 148
    return-object v0

    .line 149
    :pswitch_a
    iget-object v0, p0, LN1/r;->e:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v0, LY1/e;

    .line 152
    .line 153
    invoke-virtual {v0}, LY1/e;->invoke()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    check-cast v0, Landroidx/lifecycle/k0;

    .line 158
    .line 159
    return-object v0

    .line 160
    :pswitch_b
    iget-object v0, p0, LN1/r;->e:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v0, LN1/r;

    .line 163
    .line 164
    invoke-virtual {v0}, LN1/r;->invoke()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    check-cast v0, Landroidx/lifecycle/k0;

    .line 169
    .line 170
    return-object v0

    .line 171
    :pswitch_c
    iget-object v0, p0, LN1/r;->e:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v0, Lcom/anilab/android/ui/home/HomeFragment;

    .line 174
    .line 175
    return-object v0

    .line 176
    :pswitch_d
    iget-object v0, p0, LN1/r;->e:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v0, LN1/r;

    .line 179
    .line 180
    invoke-virtual {v0}, LN1/r;->invoke()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    check-cast v0, Landroidx/lifecycle/k0;

    .line 185
    .line 186
    return-object v0

    .line 187
    :pswitch_e
    iget-object v0, p0, LN1/r;->e:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v0, Lcom/anilab/android/ui/helpCenter/HelpCenterFragment;

    .line 190
    .line 191
    return-object v0

    .line 192
    :pswitch_f
    iget-object v0, p0, LN1/r;->e:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v0, LV1/j;

    .line 195
    .line 196
    invoke-virtual {v0}, LV1/j;->invoke()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    check-cast v0, Landroidx/lifecycle/k0;

    .line 201
    .line 202
    return-object v0

    .line 203
    :pswitch_10
    iget-object v0, p0, LN1/r;->e:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v0, LN1/r;

    .line 206
    .line 207
    invoke-virtual {v0}, LN1/r;->invoke()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    check-cast v0, Landroidx/lifecycle/k0;

    .line 212
    .line 213
    return-object v0

    .line 214
    :pswitch_11
    iget-object v0, p0, LN1/r;->e:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v0, Lcom/anilab/android/ui/filter/FilterFragment;

    .line 217
    .line 218
    return-object v0

    .line 219
    :pswitch_12
    iget-object v0, p0, LN1/r;->e:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v0, LT1/y;

    .line 222
    .line 223
    invoke-virtual {v0}, LT1/y;->invoke()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    check-cast v0, Landroidx/lifecycle/k0;

    .line 228
    .line 229
    return-object v0

    .line 230
    :pswitch_13
    iget-object v0, p0, LN1/r;->e:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v0, LT1/j;

    .line 233
    .line 234
    invoke-virtual {v0}, LT1/j;->invoke()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    check-cast v0, Landroidx/lifecycle/k0;

    .line 239
    .line 240
    return-object v0

    .line 241
    :pswitch_14
    iget-object v0, p0, LN1/r;->e:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v0, LN1/r;

    .line 244
    .line 245
    invoke-virtual {v0}, LN1/r;->invoke()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    check-cast v0, Landroidx/lifecycle/k0;

    .line 250
    .line 251
    return-object v0

    .line 252
    :pswitch_15
    iget-object v0, p0, LN1/r;->e:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v0, Lcom/anilab/android/ui/editProfile/EditProfileFragment;

    .line 255
    .line 256
    return-object v0

    .line 257
    :pswitch_16
    iget-object v0, p0, LN1/r;->e:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v0, LR1/r;

    .line 260
    .line 261
    invoke-virtual {v0}, LR1/r;->invoke()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    check-cast v0, Landroidx/lifecycle/k0;

    .line 266
    .line 267
    return-object v0

    .line 268
    :pswitch_17
    iget-object v0, p0, LN1/r;->e:Ljava/lang/Object;

    .line 269
    .line 270
    check-cast v0, LN1/r;

    .line 271
    .line 272
    invoke-virtual {v0}, LN1/r;->invoke()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    check-cast v0, Landroidx/lifecycle/k0;

    .line 277
    .line 278
    return-object v0

    .line 279
    :pswitch_18
    iget-object v0, p0, LN1/r;->e:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v0, Lcom/anilab/android/ui/comment/CommentListFragment;

    .line 282
    .line 283
    return-object v0

    .line 284
    :pswitch_19
    iget-object v0, p0, LN1/r;->e:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast v0, LN1/r;

    .line 287
    .line 288
    :try_start_0
    invoke-virtual {v0}, LN1/r;->invoke()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 292
    check-cast v0, Landroidx/lifecycle/k0;

    .line 293
    .line 294
    return-object v0

    .line 295
    :catchall_0
    move-exception v0

    .line 296
    throw v0

    .line 297
    :pswitch_1a
    iget-object v0, p0, LN1/r;->e:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v0, Lcom/anilab/android/ui/changePassword/ChangePasswordFragment;

    .line 300
    .line 301
    return-object v0

    .line 302
    :pswitch_1b
    iget-object v0, p0, LN1/r;->e:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v0, LN1/q;

    .line 305
    .line 306
    invoke-virtual {v0}, LN1/q;->invoke()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    check-cast v0, Landroidx/lifecycle/k0;

    .line 311
    .line 312
    return-object v0

    .line 313
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
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
