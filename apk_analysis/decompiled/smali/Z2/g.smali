.class public final LZ2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La3/b;


# instance fields
.field public final synthetic a:I

.field public final b:La3/b;

.field public final c:Lz7/a;


# direct methods
.method public synthetic constructor <init>(La3/b;Lz7/a;I)V
    .locals 0

    .line 1
    iput p3, p0, LZ2/g;->a:I

    iput-object p1, p0, LZ2/g;->b:La3/b;

    iput-object p2, p0, LZ2/g;->c:Lz7/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, LZ2/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v2, Ld0/o;

    .line 7
    .line 8
    const/4 v0, 0x3

    .line 9
    invoke-direct {v2, v0}, Ld0/o;-><init>(I)V

    .line 10
    .line 11
    .line 12
    new-instance v3, Le0/c;

    .line 13
    .line 14
    const/4 v0, 0x2

    .line 15
    invoke-direct {v3, v0}, Le0/c;-><init>(I)V

    .line 16
    .line 17
    .line 18
    sget-object v4, Lf3/a;->f:Lf3/a;

    .line 19
    .line 20
    iget-object v0, p0, LZ2/g;->b:La3/b;

    .line 21
    .line 22
    check-cast v0, LZ2/e;

    .line 23
    .line 24
    invoke-virtual {v0}, LZ2/e;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v1, Lf3/h;

    .line 29
    .line 30
    move-object v5, v0

    .line 31
    check-cast v5, Lf3/j;

    .line 32
    .line 33
    iget-object v6, p0, LZ2/g;->c:Lz7/a;

    .line 34
    .line 35
    invoke-direct/range {v1 .. v6}, Lf3/h;-><init>(Lh3/a;Lh3/a;Lf3/a;Lf3/j;Lz7/a;)V

    .line 36
    .line 37
    .line 38
    return-object v1

    .line 39
    :pswitch_0
    iget-object v0, p0, LZ2/g;->b:La3/b;

    .line 40
    .line 41
    check-cast v0, LZ2/e;

    .line 42
    .line 43
    iget-object v0, v0, LZ2/e;->b:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Landroid/content/Context;

    .line 46
    .line 47
    iget-object v1, p0, LZ2/g;->c:Lz7/a;

    .line 48
    .line 49
    check-cast v1, LZ2/e;

    .line 50
    .line 51
    invoke-virtual {v1}, LZ2/e;->get()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    new-instance v2, LZ2/f;

    .line 56
    .line 57
    check-cast v1, LZ2/d;

    .line 58
    .line 59
    invoke-direct {v2, v0, v1}, LZ2/f;-><init>(Landroid/content/Context;LZ2/d;)V

    .line 60
    .line 61
    .line 62
    return-object v2

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method
