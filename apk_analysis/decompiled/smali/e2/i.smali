.class public final synthetic Le2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ld2/a;


# direct methods
.method public synthetic constructor <init>(Ld2/a;I)V
    .locals 0

    .line 1
    iput p2, p0, Le2/i;->a:I

    iput-object p1, p0, Le2/i;->b:Ld2/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget p1, p0, Le2/i;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Le2/i;->b:Ld2/a;

    .line 7
    .line 8
    iget-object v0, p1, Ld2/a;->x:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lcom/anilab/domain/model/Movie;

    .line 11
    .line 12
    if-eqz v0, :cond_3

    .line 13
    .line 14
    iget-object p1, p1, Ld2/a;->w:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, Lcom/google/firebase/messaging/u;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object p1, p1, Lcom/google/firebase/messaging/u;->a:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p1, Lcom/anilab/android/ui/myList/MyListFragment;

    .line 24
    .line 25
    iget-object v1, p1, Li0/v;->v:Li0/v;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    iget-object v1, v1, Li0/v;->v:Li0/v;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v1, v2

    .line 34
    :goto_0
    instance-of v3, v1, Lcom/anilab/android/ui/main/HostFragment;

    .line 35
    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    move-object v2, v1

    .line 39
    check-cast v2, Lcom/anilab/android/ui/main/HostFragment;

    .line 40
    .line 41
    :cond_1
    if-eqz v2, :cond_2

    .line 42
    .line 43
    new-instance v1, LI1/p;

    .line 44
    .line 45
    iget-boolean v3, v0, Lcom/anilab/domain/model/Movie;->u:Z

    .line 46
    .line 47
    invoke-direct {v1, v3}, LI1/p;-><init>(Z)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v1}, LM1/n;->j0(Lu0/D;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    invoke-virtual {p1}, Lcom/anilab/android/ui/myList/MyListFragment;->t0()Le2/B;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iput-object v0, p1, Le2/B;->n:Lcom/anilab/domain/model/Movie;

    .line 58
    .line 59
    :cond_3
    return-void

    .line 60
    :pswitch_0
    iget-object p1, p0, Le2/i;->b:Ld2/a;

    .line 61
    .line 62
    iget-object v0, p1, Ld2/a;->x:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Lcom/anilab/domain/model/Movie;

    .line 65
    .line 66
    if-eqz v0, :cond_6

    .line 67
    .line 68
    iget-object p1, p1, Ld2/a;->w:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p1, Lcom/google/firebase/messaging/u;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    iget-object p1, p1, Lcom/google/firebase/messaging/u;->a:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p1, Lcom/anilab/android/ui/myList/MyListFragment;

    .line 78
    .line 79
    iget-object p1, p1, Li0/v;->v:Li0/v;

    .line 80
    .line 81
    const/4 v1, 0x0

    .line 82
    if-eqz p1, :cond_4

    .line 83
    .line 84
    iget-object p1, p1, Li0/v;->v:Li0/v;

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    move-object p1, v1

    .line 88
    :goto_1
    instance-of v2, p1, Lcom/anilab/android/ui/main/HostFragment;

    .line 89
    .line 90
    if-eqz v2, :cond_5

    .line 91
    .line 92
    move-object v1, p1

    .line 93
    check-cast v1, Lcom/anilab/android/ui/main/HostFragment;

    .line 94
    .line 95
    :cond_5
    if-eqz v1, :cond_6

    .line 96
    .line 97
    invoke-static {v1, v0}, Lcom/anilab/android/ui/main/HostFragment;->y0(Lcom/anilab/android/ui/main/HostFragment;Lcom/anilab/domain/model/Movie;)V

    .line 98
    .line 99
    .line 100
    :cond_6
    return-void

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
    .line 137
    .line 138
    .line 139
    .line 140
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
