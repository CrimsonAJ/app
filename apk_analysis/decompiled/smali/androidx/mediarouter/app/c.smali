.class public final Landroidx/mediarouter/app/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final b:Landroidx/mediarouter/app/c;

.field public static final c:Landroidx/mediarouter/app/c;

.field public static final d:Landroidx/mediarouter/app/c;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/mediarouter/app/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/mediarouter/app/c;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/mediarouter/app/c;->b:Landroidx/mediarouter/app/c;

    .line 8
    .line 9
    new-instance v0, Landroidx/mediarouter/app/c;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Landroidx/mediarouter/app/c;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Landroidx/mediarouter/app/c;->c:Landroidx/mediarouter/app/c;

    .line 16
    .line 17
    new-instance v0, Landroidx/mediarouter/app/c;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, Landroidx/mediarouter/app/c;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Landroidx/mediarouter/app/c;->d:Landroidx/mediarouter/app/c;

    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/mediarouter/app/c;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/mediarouter/app/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lt0/C;

    .line 7
    .line 8
    check-cast p2, Lt0/C;

    .line 9
    .line 10
    iget-object p1, p1, Lt0/C;->d:Ljava/lang/String;

    .line 11
    .line 12
    iget-object p2, p2, Lt0/C;->d:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1

    .line 19
    :pswitch_0
    check-cast p1, Lt0/C;

    .line 20
    .line 21
    check-cast p2, Lt0/C;

    .line 22
    .line 23
    iget-object p1, p1, Lt0/C;->d:Ljava/lang/String;

    .line 24
    .line 25
    iget-object p2, p2, Lt0/C;->d:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1

    .line 32
    :pswitch_1
    check-cast p1, Lt0/C;

    .line 33
    .line 34
    check-cast p2, Lt0/C;

    .line 35
    .line 36
    iget-object p1, p1, Lt0/C;->d:Ljava/lang/String;

    .line 37
    .line 38
    iget-object p2, p2, Lt0/C;->d:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    return p1

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method
