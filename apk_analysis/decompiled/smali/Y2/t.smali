.class public final LY2/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La3/b;


# instance fields
.field public final synthetic a:I

.field public final b:La3/b;

.field public final c:Lz7/a;

.field public final d:La3/b;


# direct methods
.method public synthetic constructor <init>(La3/b;Lz7/a;La3/b;I)V
    .locals 0

    .line 1
    iput p4, p0, LY2/t;->a:I

    iput-object p1, p0, LY2/t;->b:La3/b;

    iput-object p2, p0, LY2/t;->c:Lz7/a;

    iput-object p3, p0, LY2/t;->d:La3/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, LY2/t;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LY2/t;->b:La3/b;

    .line 7
    .line 8
    check-cast v0, LZ2/e;

    .line 9
    .line 10
    iget-object v0, v0, LZ2/e;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Landroid/content/Context;

    .line 13
    .line 14
    iget-object v1, p0, LY2/t;->c:Lz7/a;

    .line 15
    .line 16
    invoke-interface {v1}, Lz7/a;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lf3/d;

    .line 21
    .line 22
    iget-object v2, p0, LY2/t;->d:La3/b;

    .line 23
    .line 24
    check-cast v2, LY2/o;

    .line 25
    .line 26
    invoke-virtual {v2}, LY2/o;->get()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Le3/b;

    .line 31
    .line 32
    new-instance v3, Le3/d;

    .line 33
    .line 34
    invoke-direct {v3, v0, v1, v2}, Le3/d;-><init>(Landroid/content/Context;Lf3/d;Le3/b;)V

    .line 35
    .line 36
    .line 37
    return-object v3

    .line 38
    :pswitch_0
    new-instance v5, Ld0/o;

    .line 39
    .line 40
    const/4 v0, 0x3

    .line 41
    invoke-direct {v5, v0}, Ld0/o;-><init>(I)V

    .line 42
    .line 43
    .line 44
    new-instance v6, Le0/c;

    .line 45
    .line 46
    const/4 v0, 0x2

    .line 47
    invoke-direct {v6, v0}, Le0/c;-><init>(I)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, LY2/t;->b:La3/b;

    .line 51
    .line 52
    check-cast v0, Ld3/b;

    .line 53
    .line 54
    invoke-virtual {v0}, Ld3/b;->get()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    move-object v7, v0

    .line 59
    check-cast v7, Ld3/c;

    .line 60
    .line 61
    iget-object v0, p0, LY2/t;->c:Lz7/a;

    .line 62
    .line 63
    check-cast v0, Le3/k;

    .line 64
    .line 65
    invoke-virtual {v0}, Le3/k;->get()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    move-object v8, v0

    .line 70
    check-cast v8, Le3/j;

    .line 71
    .line 72
    iget-object v0, p0, LY2/t;->d:La3/b;

    .line 73
    .line 74
    check-cast v0, Le3/m;

    .line 75
    .line 76
    invoke-virtual {v0}, Le3/m;->get()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    move-object v9, v0

    .line 81
    check-cast v9, Le3/l;

    .line 82
    .line 83
    new-instance v4, LY2/s;

    .line 84
    .line 85
    invoke-direct/range {v4 .. v9}, LY2/s;-><init>(Lh3/a;Lh3/a;Ld3/c;Le3/j;Le3/l;)V

    .line 86
    .line 87
    .line 88
    return-object v4

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
