.class public final LX1/b;
.super LM1/o;
.source "SourceFile"


# instance fields
.field public final u:LJ1/Q0;

.field public final v:LX1/B;

.field public final w:LX1/C;


# direct methods
.method public constructor <init>(LJ1/Q0;LX1/B;LX1/C;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "option"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1}, LM1/o;-><init>(LW/g;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LX1/b;->u:LJ1/Q0;

    .line 15
    .line 16
    iput-object p2, p0, LX1/b;->v:LX1/B;

    .line 17
    .line 18
    iput-object p3, p0, LX1/b;->w:LX1/C;

    .line 19
    .line 20
    return-void
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
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
.end method


# virtual methods
.method public final r(Ljava/lang/Object;)V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    check-cast p1, LH2/g;

    .line 4
    .line 5
    iget-object v2, p0, LX1/b;->u:LJ1/Q0;

    .line 6
    .line 7
    iget-object v3, v2, LJ1/Q0;->w:Landroidx/appcompat/widget/AppCompatImageView;

    .line 8
    .line 9
    const-string v4, "imageMovie"

    .line 10
    .line 11
    invoke-static {v3, v4}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v4, p1, LH2/g;->i:Lcom/anilab/domain/model/Movie;

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    iget-object v4, v4, Lcom/anilab/domain/model/Movie;->b:Ljava/lang/String;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v4, 0x0

    .line 22
    :goto_0
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    invoke-static {v5}, Lt1/a;->a(Landroid/content/Context;)Lt1/m;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    new-instance v6, LC1/h;

    .line 31
    .line 32
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    invoke-direct {v6, v7}, LC1/h;-><init>(Landroid/content/Context;)V

    .line 37
    .line 38
    .line 39
    iput-object v4, v6, LC1/h;->c:Ljava/lang/Object;

    .line 40
    .line 41
    invoke-virtual {v6, v3}, LC1/h;->b(Landroid/widget/ImageView;)V

    .line 42
    .line 43
    .line 44
    new-instance v3, LF1/b;

    .line 45
    .line 46
    iget-object v4, p0, LF0/r0;->a:Landroid/view/View;

    .line 47
    .line 48
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    const v8, 0x7f0700b5

    .line 57
    .line 58
    .line 59
    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDimension(I)F

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    invoke-direct {v3, v7}, LF1/b;-><init>(F)V

    .line 64
    .line 65
    .line 66
    new-array v7, v1, [LF1/c;

    .line 67
    .line 68
    aput-object v3, v7, v0

    .line 69
    .line 70
    invoke-static {v7}, LB7/j;->o0([Ljava/lang/Object;)Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-static {v3}, Lcom/google/android/gms/internal/measurement/u1;->e0(Ljava/util/List;)Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    iput-object v3, v6, LC1/h;->e:Ljava/util/List;

    .line 79
    .line 80
    invoke-virtual {v6}, LC1/h;->a()LC1/i;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-virtual {v5, v3}, Lt1/m;->b(LC1/i;)LC1/k;

    .line 85
    .line 86
    .line 87
    iget v3, p1, LH2/g;->g:I

    .line 88
    .line 89
    iget-object v5, v2, LJ1/Q0;->y:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    .line 90
    .line 91
    invoke-virtual {v5, v3}, LA5/d;->setProgress(I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    iget v4, p1, LH2/g;->e:I

    .line 99
    .line 100
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    new-array v5, v1, [Ljava/lang/Object;

    .line 105
    .line 106
    aput-object v4, v5, v0

    .line 107
    .line 108
    const v4, 0x7f1400b8

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3, v4, v5}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    iget-object v4, v2, LJ1/Q0;->z:Landroidx/appcompat/widget/AppCompatTextView;

    .line 116
    .line 117
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 118
    .line 119
    .line 120
    new-instance v3, LX1/a;

    .line 121
    .line 122
    invoke-direct {v3, p0, p1, v0}, LX1/a;-><init>(LX1/b;LH2/g;I)V

    .line 123
    .line 124
    .line 125
    iget-object v0, v2, LW/g;->k:Landroid/view/View;

    .line 126
    .line 127
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 128
    .line 129
    .line 130
    new-instance v0, LX1/a;

    .line 131
    .line 132
    invoke-direct {v0, p0, p1, v1}, LX1/a;-><init>(LX1/b;LH2/g;I)V

    .line 133
    .line 134
    .line 135
    iget-object p1, v2, LJ1/Q0;->v:Landroidx/appcompat/widget/AppCompatImageView;

    .line 136
    .line 137
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 138
    .line 139
    .line 140
    return-void
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
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
.end method
