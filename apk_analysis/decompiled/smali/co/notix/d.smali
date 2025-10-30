.class public final Lco/notix/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lco/notix/y8;

.field public final b:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(Lco/notix/d9;)V
    .locals 1

    const-string v0, "contextProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/notix/d;->a:Lco/notix/y8;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lco/notix/d;->b:Ljava/util/LinkedHashMap;

    return-void
.end method
